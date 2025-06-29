import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


interface ExternalApi {
    String getData();
}


class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData(); 
    }
}


public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
       
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

      
        service.fetchData();

        
        verify(mockApi).getData();  
    }
