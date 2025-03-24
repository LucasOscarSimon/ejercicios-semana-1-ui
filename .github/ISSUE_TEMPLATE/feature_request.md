name: Feature Request
description: Suggest a new idea or improvement
title: "[Feature]: "
labels: [enhancement]
body:
  - type: textarea
    attributes:
      label: Summary
      description: What's the feature or improvement about?
    validations:
      required: true

  - type: textarea
    attributes:
      label: Motivation
      description: Why is this feature useful or necessary?
    validations:
      required: true

  - type: textarea
    attributes:
      label: Suggested implementation
    validations:
      required: false

  - type: textarea
    attributes:
      label: Additional context
    validations:
      required: false
