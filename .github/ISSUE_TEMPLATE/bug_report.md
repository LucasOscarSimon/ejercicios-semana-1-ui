name: Bug Report
description: Report an unexpected behavior or issue
title: "[Bug]: "
labels: [bug]
body:
  - type: textarea
    attributes:
      label: Summary
      description: Briefly describe the bug
    validations:
      required: true

  - type: textarea
    attributes:
      label: Steps to Reproduce
      description: How can we reproduce the issue?
      placeholder: |
        1. Open the app
        2. Click on 'X'
        3. See the error
    validations:
      required: true

  - type: textarea
    attributes:
      label: Expected behavior
    validations:
      required: true

  - type: textarea
    attributes:
      label: Screenshots or logs
    validations:
      required: false

  - type: textarea
    attributes:
      label: Additional context
    validations:
      required: false
