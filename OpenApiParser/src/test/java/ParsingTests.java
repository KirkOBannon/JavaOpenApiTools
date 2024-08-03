import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.inject.Inject;
import com.koboldcode.spec.OpenApiDoc;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.io.IOException;

@Guice
public class ParsingTests {
    @Inject
    private JsonMapper jsonMapper;

    @Test
    public void verifyParsePetstore3() throws IOException {
        try(var inStr = ParsingTests.class.getResourceAsStream("/openapi/specs/Petstore-3.0.json")) {
            var petStoreSpec = jsonMapper.readValue(inStr, OpenApiDoc.class);
        }
    }
}
