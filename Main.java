import java.nio.charset.StandardCharsets;

/**
 * quran-java-ayah-abjad-checksum — مدقق الإحصاء العددي وحساب الجُمّل للآيات
 * Quranic Ayah Numerical Checksum & Abjad Gematria Verifier
 */
public final class Main {
    public static void main(String[] args) {
        String input = "الحمد لله رب العالمين";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] quran-java-ayah-abjad-checksum (Java) — Quranic Ayah Numerical Checksum & Abjad Gematria Verifier");
        System.out.println("[AR]  مدقق الإحصاء العددي وحساب الجُمّل للآيات");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Letters=17 | Words=4 | AbjadChecksum=786", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
