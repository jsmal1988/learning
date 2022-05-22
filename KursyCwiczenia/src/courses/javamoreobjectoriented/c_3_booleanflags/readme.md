A poorly designed class example:
- it tries to do everything by itself
- relies on if-else instructions
- behavior was factored out into other classes

Applying state design patter:
- hold a reference to the current state object
- substitute the reference when state changed


Benefits:
- class are simple
- delegates to state 