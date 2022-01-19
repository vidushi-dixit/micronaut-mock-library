# Mock library

How to reproduce the problem 
- Include this library to a target project
- application.yml of target project should have
```
micronaut:
  test:
    internal:
        url: "internal"
    default:
        url: "default"``
```
- We are trying to load Test bean, but they are not available in ApplicationContext