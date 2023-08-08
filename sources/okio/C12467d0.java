package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.d0 */
public final /* synthetic */ class C12467d0 {

    /* renamed from: a */
    public static final Logger f30404a = Logger.getLogger("okio.Okio");

    @C12579k
    /* renamed from: b */
    public static final C12506n0 m50503b(@C12579k File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "$this$appendingSink");
        return C12465c0.m50491n(new FileOutputStream(file, true));
    }

    @C12579k
    /* renamed from: c */
    public static final C12509p m50504c(@C12579k C12506n0 n0Var, @C12579k Cipher cipher) {
        Intrinsics.checkNotNullParameter(n0Var, "$this$cipherSink");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new C12509p(C12465c0.m50480c(n0Var), cipher);
    }

    @C12579k
    /* renamed from: d */
    public static final C12511q m50505d(@C12579k C12510p0 p0Var, @C12579k Cipher cipher) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$cipherSource");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new C12511q(C12465c0.m50481d(p0Var), cipher);
    }

    /* renamed from: e */
    public static final Logger m50506e() {
        return f30404a;
    }

    @C12579k
    /* renamed from: f */
    public static final C12526y m50507f(@C12579k C12506n0 n0Var, @C12579k MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(n0Var, "$this$hashingSink");
        Intrinsics.checkNotNullParameter(messageDigest, "digest");
        return new C12526y(n0Var, messageDigest);
    }

    @C12579k
    /* renamed from: g */
    public static final C12526y m50508g(@C12579k C12506n0 n0Var, @C12579k Mac mac) {
        Intrinsics.checkNotNullParameter(n0Var, "$this$hashingSink");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new C12526y(n0Var, mac);
    }

    @C12579k
    /* renamed from: h */
    public static final C12528z m50509h(@C12579k C12510p0 p0Var, @C12579k MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$hashingSource");
        Intrinsics.checkNotNullParameter(messageDigest, "digest");
        return new C12528z(p0Var, messageDigest);
    }

    @C12579k
    /* renamed from: i */
    public static final C12528z m50510i(@C12579k C12510p0 p0Var, @C12579k Mac mac) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$hashingSource");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new C12528z(p0Var, mac);
    }

    /* renamed from: j */
    public static final boolean m50511j(@C12579k AssertionError assertionError) {
        boolean z;
        Intrinsics.checkNotNullParameter(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @C12579k
    @C11315i
    /* renamed from: k */
    public static final C12506n0 m50512k(@C12579k File file) throws FileNotFoundException {
        return m50517p(file, false, 1, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: l */
    public static final C12506n0 m50513l(@C12579k File file, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "$this$sink");
        return C12465c0.m50491n(new FileOutputStream(file, z));
    }

    @C12579k
    /* renamed from: m */
    public static final C12506n0 m50514m(@C12579k OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "$this$sink");
        return new C12474g0(outputStream, new C12516r0());
    }

    @C12579k
    /* renamed from: n */
    public static final C12506n0 m50515n(@C12579k Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "$this$sink");
        C12508o0 o0Var = new C12508o0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        return o0Var.sink(new C12474g0(outputStream, o0Var));
    }

    @IgnoreJRERequirement
    @C12579k
    /* renamed from: o */
    public static final C12506n0 m50516o(@C12579k Path path, @C12579k OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "$this$sink");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        OutputStream a = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "Files.newOutputStream(this, *options)");
        return C12465c0.m50491n(a);
    }

    /* renamed from: p */
    public static /* synthetic */ C12506n0 m50517p(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return C12465c0.m50490m(file, z);
    }

    @C12579k
    /* renamed from: q */
    public static final C12510p0 m50518q(@C12579k File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "$this$source");
        return C12465c0.m50496s(new FileInputStream(file));
    }

    @C12579k
    /* renamed from: r */
    public static final C12510p0 m50519r(@C12579k InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "$this$source");
        return new C12463b0(inputStream, new C12516r0());
    }

    @C12579k
    /* renamed from: s */
    public static final C12510p0 m50520s(@C12579k Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "$this$source");
        C12508o0 o0Var = new C12508o0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        return o0Var.source(new C12463b0(inputStream, o0Var));
    }

    @IgnoreJRERequirement
    @C12579k
    /* renamed from: t */
    public static final C12510p0 m50521t(@C12579k Path path, @C12579k OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "$this$source");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        InputStream a = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "Files.newInputStream(this, *options)");
        return C12465c0.m50496s(a);
    }
}
