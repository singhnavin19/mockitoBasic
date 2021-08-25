
#Mock Annotation 


### Always use <span style="color:blue">RunWith(MockitoJUnitRunner.class) </span>along with class to use below annotations

		@RunWith(MockitoJUnitRunner.class)
		public class MockExamplesWithAnnotation {
		                                         .
		                                         .
		}                                         

#### @Verify

>  Verify in Mockito simply means that you want to check if a certain method of a mock object has been called by specific number of 
>  times. When doing verification that a method was called exactly once, then we use:?

>  verify(mockObject).someMethodOfMockObject(someArgument);
    If the method was called multiple times, and you want to verify that it was called for specific times, lets say 3 times, then we 
> use:?

    verify(mockObject).someMethodOfMockObject(someArgument);
    
    If the method was called multiple times, and you want to verify that it was called for specific times, 
    lets say 3 times, then we use:

    verify(mockObject, times(3)).someMethodOfMockObject(someArgument);
    times() means the number of invocations you expect.

#### Difference between @Spy and @Mock in Mockito

>  -  The difference is that in mock, you are creating a complete mock or fake object while in spy, 
	  there is the real object and you just spying or stubbing specific methods of it. ... 
	  When using mock objects, the default behavior of the method when not stub is do nothing.


- h









  