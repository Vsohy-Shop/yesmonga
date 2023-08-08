package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22514bv = {1, 0, 3}, mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo22516d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, mo22517k = 3, mo22518mv = {1, 4, 0})
public final class Handshake$Companion$get$1 extends Lambda implements C11289a<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @C12579k
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
