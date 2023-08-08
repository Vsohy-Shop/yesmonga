package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.internal.Util;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B;\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8GX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b\u0014\u0010\rR\u0018\u0010%\u001a\u00020\u001c*\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, mo22516d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "", "hashCode", "", "toString", "peerCertificates$delegate", "Lkotlin/z;", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/a;)V", "Companion", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class Handshake {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final CipherSuite cipherSuite;
    @C12579k
    private final List<Certificate> localCertificates;
    @C12579k
    private final C11677z peerCertificates$delegate;
    @C12579k
    private final TlsVersion tlsVersion;

    @C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, mo22516d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return Util.immutableListOf((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return CollectionsKt__CollectionsKt.m40441E();
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "sslSession.handshake()", imports = {}))
        @C11314h(name = "-deprecated_get")
        @C12579k
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m172636deprecated_get(@C12579k SSLSession sSLSession) throws IOException {
            Intrinsics.checkNotNullParameter(sSLSession, "sslSession");
            return get(sSLSession);
        }

        @C11314h(name = "get")
        @C12579k
        @C11384m
        public final Handshake get(@C12579k SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            Intrinsics.checkNotNullParameter(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!Intrinsics.areEqual((Object) "NONE", (Object) protocol)) {
                    TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                    try {
                        list = toImmutableList(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = CollectionsKt__CollectionsKt.m40441E();
                    }
                    return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        public final Handshake get(@C12579k TlsVersion tlsVersion, @C12579k CipherSuite cipherSuite, @C12579k List<? extends Certificate> list, @C12579k List<? extends Certificate> list2) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(list, "peerCertificates");
            Intrinsics.checkNotNullParameter(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    public Handshake(@C12579k TlsVersion tlsVersion2, @C12579k CipherSuite cipherSuite2, @C12579k List<? extends Certificate> list, @C12579k C11289a<? extends List<? extends Certificate>> aVar) {
        Intrinsics.checkNotNullParameter(tlsVersion2, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite2, "cipherSuite");
        Intrinsics.checkNotNullParameter(list, "localCertificates");
        Intrinsics.checkNotNullParameter(aVar, "peerCertificatesFn");
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.localCertificates = list;
        this.peerCertificates$delegate = C10864b0.m38748c(new Handshake$peerCertificates$2(aVar));
    }

    @C11314h(name = "get")
    @C12579k
    @C11384m
    public static final Handshake get(@C12579k SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "cipherSuite", imports = {}))
    @C11314h(name = "-deprecated_cipherSuite")
    @C12579k
    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m172630deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "localCertificates", imports = {}))
    @C11314h(name = "-deprecated_localCertificates")
    @C12579k
    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m172631deprecated_localCertificates() {
        return this.localCertificates;
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "localPrincipal", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_localPrincipal")
    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m172632deprecated_localPrincipal() {
        return localPrincipal();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "peerCertificates", imports = {}))
    @C11314h(name = "-deprecated_peerCertificates")
    @C12579k
    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m172633deprecated_peerCertificates() {
        return peerCertificates();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "peerPrincipal", imports = {}))
    @C12580l
    @C11314h(name = "-deprecated_peerPrincipal")
    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m172634deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @C11587t0(expression = "tlsVersion", imports = {}))
    @C11314h(name = "-deprecated_tlsVersion")
    @C12579k
    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m172635deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @C11314h(name = "cipherSuite")
    @C12579k
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.tlsVersion == this.tlsVersion && Intrinsics.areEqual((Object) handshake.cipherSuite, (Object) this.cipherSuite) && Intrinsics.areEqual((Object) handshake.peerCertificates(), (Object) peerCertificates()) && Intrinsics.areEqual((Object) handshake.localCertificates, (Object) this.localCertificates);
        }
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @C11314h(name = "localCertificates")
    @C12579k
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @C12580l
    @C11314h(name = "localPrincipal")
    public final Principal localPrincipal() {
        Object B2 = CollectionsKt___CollectionsKt.m40479B2(this.localCertificates);
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @C11314h(name = "peerCertificates")
    @C12579k
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @C12580l
    @C11314h(name = "peerPrincipal")
    public final Principal peerPrincipal() {
        Object B2 = CollectionsKt___CollectionsKt.m40479B2(peerCertificates());
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @C11314h(name = "tlsVersion")
    @C12579k
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @C12579k
    public String toString() {
        Iterable<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(peerCertificates, 10));
        for (Certificate name : peerCertificates) {
            arrayList.add(getName(name));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        Iterable<Certificate> iterable = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Certificate name2 : iterable) {
            arrayList2.add(getName(name2));
        }
        sb.append(arrayList2);
        sb.append(C12361b.f30259j);
        return sb.toString();
    }

    @C12579k
    @C11384m
    public static final Handshake get(@C12579k TlsVersion tlsVersion2, @C12579k CipherSuite cipherSuite2, @C12579k List<? extends Certificate> list, @C12579k List<? extends Certificate> list2) {
        return Companion.get(tlsVersion2, cipherSuite2, list, list2);
    }
}
