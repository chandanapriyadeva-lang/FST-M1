package Activities;

public class PlanetAge {

    public static void main(String[] args) {

        // Given age in seconds
        double ageInSeconds = 1_000_000_000;

        // Earth year in seconds
        double earthYearSeconds = 31557600.0;

        // Orbital periods (in Earth years)
        double mercury = 0.2408467;
        double venus = 0.61519726;
        double mars = 1.8808158;
        double jupiter = 11.862615;
        double saturn = 29.447498;
        double uranus = 84.016846;
        double neptune = 164.79132;

        // Calculate age on each planet
        double ageOnEarth = ageInSeconds / earthYearSeconds;
        double ageOnMercury = ageOnEarth / mercury;
        double ageOnVenus = ageOnEarth / venus;
        double ageOnMars = ageOnEarth / mars;
        double ageOnJupiter = ageOnEarth / jupiter;
        double ageOnSaturn = ageOnEarth / saturn;
        double ageOnUranus = ageOnEarth / uranus;
        double ageOnNeptune = ageOnEarth / neptune;

        // Print results
        System.out.printf("Age on Earth: %.2f years%n", ageOnEarth);
        System.out.printf("Age on Mercury: %.2f years%n", ageOnMercury);
        System.out.printf("Age on Venus: %.2f years%n", ageOnVenus);
        System.out.printf("Age on Mars: %.2f years%n", ageOnMars);
        System.out.printf("Age on Jupiter: %.2f years%n", ageOnJupiter);
        System.out.printf("Age on Saturn: %.2f years%n", ageOnSaturn);
        System.out.printf("Age on Uranus: %.2f years%n", ageOnUranus);
        System.out.printf("Age on Neptune: %.2f years%n", ageOnNeptune);
    }
}

