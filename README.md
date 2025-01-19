# Groovy Null List Handling

This example demonstrates a common issue in Groovy: handling null values passed to methods expecting Lists.  Directly accessing methods on a null List throws a NullPointerException.  A robust solution should explicitly check for null and return a default value (e.g., an empty list) to avoid the exception.