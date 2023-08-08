package okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.c0 */
public final class C12465c0 {
    @C12579k
    /* renamed from: a */
    public static final C12506n0 m50478a(@C12579k File file) throws FileNotFoundException {
        return C12467d0.m50503b(file);
    }

    @C11314h(name = "blackhole")
    @C12579k
    /* renamed from: b */
    public static final C12506n0 m50479b() {
        return C12469e0.m50524a();
    }

    @C12579k
    /* renamed from: c */
    public static final C12505n m50480c(@C12579k C12506n0 n0Var) {
        return C12469e0.m50525b(n0Var);
    }

    @C12579k
    /* renamed from: d */
    public static final C12507o m50481d(@C12579k C12510p0 p0Var) {
        return C12469e0.m50526c(p0Var);
    }

    @C12579k
    /* renamed from: e */
    public static final C12509p m50482e(@C12579k C12506n0 n0Var, @C12579k Cipher cipher) {
        return C12467d0.m50504c(n0Var, cipher);
    }

    @C12579k
    /* renamed from: f */
    public static final C12511q m50483f(@C12579k C12510p0 p0Var, @C12579k Cipher cipher) {
        return C12467d0.m50505d(p0Var, cipher);
    }

    @C12579k
    /* renamed from: g */
    public static final C12526y m50484g(@C12579k C12506n0 n0Var, @C12579k MessageDigest messageDigest) {
        return C12467d0.m50507f(n0Var, messageDigest);
    }

    @C12579k
    /* renamed from: h */
    public static final C12526y m50485h(@C12579k C12506n0 n0Var, @C12579k Mac mac) {
        return C12467d0.m50508g(n0Var, mac);
    }

    @C12579k
    /* renamed from: i */
    public static final C12528z m50486i(@C12579k C12510p0 p0Var, @C12579k MessageDigest messageDigest) {
        return C12467d0.m50509h(p0Var, messageDigest);
    }

    @C12579k
    /* renamed from: j */
    public static final C12528z m50487j(@C12579k C12510p0 p0Var, @C12579k Mac mac) {
        return C12467d0.m50510i(p0Var, mac);
    }

    /* renamed from: k */
    public static final boolean m50488k(@C12579k AssertionError assertionError) {
        return C12467d0.m50511j(assertionError);
    }

    @C12579k
    @C11315i
    /* renamed from: l */
    public static final C12506n0 m50489l(@C12579k File file) throws FileNotFoundException {
        return C12467d0.m50517p(file, false, 1, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: m */
    public static final C12506n0 m50490m(@C12579k File file, boolean z) throws FileNotFoundException {
        return C12467d0.m50513l(file, z);
    }

    @C12579k
    /* renamed from: n */
    public static final C12506n0 m50491n(@C12579k OutputStream outputStream) {
        return C12467d0.m50514m(outputStream);
    }

    @C12579k
    /* renamed from: o */
    public static final C12506n0 m50492o(@C12579k Socket socket) throws IOException {
        return C12467d0.m50515n(socket);
    }

    @IgnoreJRERequirement
    @C12579k
    /* renamed from: p */
    public static final C12506n0 m50493p(@C12579k Path path, @C12579k OpenOption... openOptionArr) throws IOException {
        return C12467d0.m50516o(path, openOptionArr);
    }

    @C12579k
    /* renamed from: r */
    public static final C12510p0 m50495r(@C12579k File file) throws FileNotFoundException {
        return C12467d0.m50518q(file);
    }

    @C12579k
    /* renamed from: s */
    public static final C12510p0 m50496s(@C12579k InputStream inputStream) {
        return C12467d0.m50519r(inputStream);
    }

    @C12579k
    /* renamed from: t */
    public static final C12510p0 m50497t(@C12579k Socket socket) throws IOException {
        return C12467d0.m50520s(socket);
    }

    @IgnoreJRERequirement
    @C12579k
    /* renamed from: u */
    public static final C12510p0 m50498u(@C12579k Path path, @C12579k OpenOption... openOptionArr) throws IOException {
        return C12467d0.m50521t(path, openOptionArr);
    }

    /* renamed from: v */
    public static final <T extends Closeable, R> R m50499v(T t, @C12579k C11300l<? super T, ? extends R> lVar) {
        return C12469e0.m50527d(t, lVar);
    }
}
