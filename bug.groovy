```groovy
def myMethod(List<String> list) {
    if (list == null) {
        return [] // Return an empty list instead of null
    }
    // ... rest of your method
}

println myMethod(null) //This will now print []
```