package kotlin.text.jdk8;

import kotlin.C11665v0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11607h;
import kotlin.text.C11608i;
import kotlin.text.C11609j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "RegexExtensionsJDK8Kt")
/* renamed from: kotlin.text.jdk8.a */
public final class C11610a {
    @C12580l
    @C11665v0(version = "1.2")
    /* renamed from: a */
    public static final C11607h m45235a(@C12579k C11608i iVar, @C12579k String str) {
        C11609j jVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        if (iVar instanceof C11609j) {
            jVar = (C11609j) iVar;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            return jVar.get(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
