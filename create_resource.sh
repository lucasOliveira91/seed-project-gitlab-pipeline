#!/bin/bash
kubectl apply -f <<EOF
apiVersion: v1
kind: ConfigMap
metadata:
  name: ar-valecard
data:
  BOOLEAN_VALUE: $BOOLEAN_VALUE
  DB_PASSWORD: $DB_PASSWORD
  INTEGER_VALUE: $INTEGER_VALUE
  MEU_TOKEN_ESPECIAL: $MEU_TOKEN_ESPECIAL
EOF
