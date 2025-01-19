```groovy
def myMethod(List<String> list) {
    list = list ?: [] //Use elvis operator to provide default
    //Or
    if (list == null) {
        list = []
    }
    // ... rest of your method, using the list which is now guaranteed to be a list
    return list.size()
}

println myMethod(null) //Prints 0
println myMethod(['a','b','c']) //Prints 3
```