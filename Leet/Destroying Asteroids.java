//nt
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for (int i=0; i<asteroids.length; i++) {
            if (mass>=asteroids[i]) mass+=asteroids[i];
            else return false;
            if (mass>100000) return true;
        }
        return true;
    }
}
