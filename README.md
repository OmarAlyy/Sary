# Sary
Design and implement Sary flagship Android app Catalog screen
For the purpose of demonstrating the use of clean architecture (MVVM, Solid Principle, OOP)

- [S.O.L.I.D](https://en.wikipedia.org/wiki/SOLID) priciple followed for more understandable, flexible and maintainable.



**MVVM Best Pratice:**
- Avoid references to Views in ViewModels.
- Instead of pushing data to the UI, let the UI observe changes to it.
- Distribute responsibilities, add a domain layer if needed.
- Add a data repository as the single-point entry to your data.
- Expose information about the state of your data using a wrapper or another LiveData.
- Consider edge cases, leaks and how long-running operations can affect the instances in your architecture.
- Don’t put logic in the ViewModel that is critical to saving clean state or related to data. Any call you make from a ViewModel can be the last one.

  ![mvvm](https://user-images.githubusercontent.com/1812129/68319008-e9d39d00-00bd-11ea-9245-ebedd2a2c067.png)
  
  
## - Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Rx-Java](https://github.com/ReactiveX/RxJava) - For composing asynchronous and event-based programs by using observable sequences.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
- [Dagger - Hilt](https://developer.android.com/training/dependency-injection/hilt-android/) - Dependency Injection Framework
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [OkHttp](http://square.github.io/okhttp/) - HTTP client that's efficient by default: HTTP/2 support allows all requests to the same host to share a socket
- [Glide](https://github.com/bumptech/glide) - image loading framework for Android
- [Gson](https://github.com/google/gson) - used to convert Java Objects into their JSON representation and vice versa.
- [View Binding](https://developer.android.com/topic/libraries/view-binding/) - allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
- [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services.
- [Navigation](https://developer.android.com/guide/navigation/) - helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer.





### Layers
- **Domain** - Would execute business logic which is independent of any layer and is just a pure kotlin/java package with no android specific dependency.
- **Data** - Would dispense the required data for the application to the domain layer by implementing interface exposed by the domain.
- **Presentation / app** - Would include both domain and data layer and is android specific which executes the UI logic.


## Android 3 Layers Architecture
![https://fernandocejas.com/2018/05/07/architecting-android-reloaded/](https://github.com/android10/Sample-Data/blob/master/Android-CleanArchitecture-Kotlin/architecture/clean_architecture_reloaded_layers.png)

### ----------------------------------------------------------------------------------------------

## UI Layer: MVVM 
![https://fernandocejas.com/2018/05/07/architecting-android-reloaded/](https://github.com/android10/Sample-Data/blob/master/Android-CleanArchitecture-Kotlin/architecture/clean_architecture_reloaded_mvvm_app.png)

### ----------------------------------------------------------------------------------------------

## Data Layer: Repository 
![https://fernandocejas.com/2018/05/07/architecting-android-reloaded/](https://github.com/android10/Sample-Data/blob/master/Android-CleanArchitecture-Kotlin/architecture/clean_archictecture_reloaded_repository.png)



## - Modules of App
  ### App 
  It uses the all the components and class releated to Android Framework. It gets the data from presentation layer and shows on UI.
  
  ### BuildSrc
  This module helps to list and manage all the dependencies of the app at one place. It has list of dependencies and versions of that dependencies.
  
  ### Data 
  The Data layer is our access point to external data layers and is used to fetch data from multiple sources (the cache and remote in our case).
  
  ### Domain
  The domain layer responsibility is to simply contain the UseCase instance used to retrieve data from the Data layer and pass it onto the Presentation layer. 
  

