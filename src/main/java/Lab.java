public class Lab {
    public String returnNumbers(int start, int end) {
        String buildingString = "";
        
        for (int i = start; i < end; i++) {
            buildingString = buildingString + i + " ";
        }
        
        return buildingString.trim();
    }
}