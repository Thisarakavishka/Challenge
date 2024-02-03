## Create java object
First create java class(Object) represent JSON properties
   ```java
   public class TestObject{
        private String property;
        private double propertyValue;
        private int value;
}
   ```
## Deserialize
Deserialize JSON values to java object using any json library
   ```java
   ObjectMapper objectMapper = new ObjectMapper();
   TestObject testObject = objectMapper.readValue(req.getInputStream, TestObject.class);
   ```

## Manipulate
Now java object can manipulation

## Serialize
Now java object can serialize to JSON object
   ```java
   String json = objectMapper.writeValueAsString(testObject);
   ```