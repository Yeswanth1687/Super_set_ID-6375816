ExternalApi.java
public interface ExternalApi {
    String getData();
}
MyServices.java:
public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
MyServiceTest.java:
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
    
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

       
        MyService service = new MyService(mockApi);

       
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
