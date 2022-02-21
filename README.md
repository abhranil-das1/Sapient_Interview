# LBG_Public API Beer App

The app has the following functionality:
• Using the API, the user sees a list of beers - this information includes the name of the beer, the beer’s image and ABV value
• On clicking a beer, the user sees further information on that beer in a new screen – this information includes more detailed information such as the description

# Technologies Used
- MVVM Architecture with Usecase layer, repository layer, domain and data layer
- Mockito to mock the ViewModel and Repository classes along with Koin injection
- Truth library for performing assertions in tests
- Espresso to perform instrumentation tests on the user interface
- Retrofit, okhttp  to provide access to the backend API endpoints
- Coroutines to run API network requests on background threads. Coroutines stick to a thread, and as soon as suspension point is reached, it leaves the Thread and frees it up letting it to pick up another coroutine if it is waiting. This way with less threads and less memory usage, that much concurrent work can be done
- AndroidX to provide Lifecycle and LiveData functionality to the app
- Room to store the news responses from Retrofit and coroutines
- Facebook custom image views and Fresco Image Loading library
- Koin to provide constructor dependency injection to classes in the application

![](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

# Screenshots
![alt text](https://github.com/ldunneone/Snoop-Test-codetest-Dunne/blob/master/app/images/MainScreen.png)
![alt text](https://github.com/ldunneone/Snoop-Test-codetest-Dunne/blob/master/app/images/DetailScreen.png)
