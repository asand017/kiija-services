aws lambda publish-layer-version --layer-name kiija-layer \
    --description "Layer for kiija-services calls" \
    --license-info "MIT" \
    --zip-file fileb://kiija-services/build/distributions/kiija-layer.zip \
    --compatible-runtimes java17 \
    --compatible-architectures "arm64" "x86_64"