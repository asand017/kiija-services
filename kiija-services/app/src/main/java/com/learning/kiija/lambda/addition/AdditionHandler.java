package com.learning.kiija.lambda.addition;

import com.learning.kiija.beans.AdditionSubtractionResponseBean;
import com.learning.kiija.lambda.records.Input;
import com.learning.kiija.lambda.records.Output;
import com.learning.kiija.beans.AdditionSubtractionRequestBean;
import com.learning.kiija.beans.AdditionSubtractionResponseBean;
import com.learning.kiija.exceptions.ZeroDigitException;
import com.learning.kiija.service.AdditionService;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;

public class AdditionHandler implements RequestHandler<Input, Output>{

    @Autowired
    private static AdditionService additionService;

    @Override
    public Output handleRequest(Input event, Context context) throws ZeroDigitException{
        LambdaLogger logger = context.getLogger();
        logger.log("creating " + event.type() + " problems with " + event.numOfOperands() + " operands.");

        return getAdditionProblems(event);
    }

    private static Output getAdditionProblems(Input event) throws ZeroDigitException {
        AdditionSubtractionRequestBean request = buildRequestBean(event);
        AdditionSubtractionResponseBean response = additionService.generateProblems(request);
        return buildResponse(response);
    }

    private static AdditionSubtractionRequestBean buildRequestBean(Input input) {
        AdditionSubtractionRequestBean requestBean = new AdditionSubtractionRequestBean();
        requestBean.setType(input.type());
        requestBean.setNumOfOperands(input.numOfOperands());
        requestBean.setOperandDigits(input.operandDigits());
        return requestBean;
    }

    private static Output buildResponse(AdditionSubtractionResponseBean response) {
        return new Output(response.getProblems());
    }


}
