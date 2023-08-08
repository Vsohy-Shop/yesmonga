package kotlin.p010io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.C10927c1;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* renamed from: kotlin.io.path.x */
public final class C11265x {
    @C12579k

    /* renamed from: a */
    public static final C11265x f28403a = new C11265x();
    @C12579k

    /* renamed from: b */
    public static final LinkOption[] f28404b = {LinkOption.NOFOLLOW_LINKS};
    @C12579k

    /* renamed from: c */
    public static final LinkOption[] f28405c = new LinkOption[0];
    @C12579k

    /* renamed from: d */
    public static final Set<FileVisitOption> f28406d = C10930d1.m40892k();
    @C12579k

    /* renamed from: e */
    public static final Set<FileVisitOption> f28407e = C10927c1.m40883f(FileVisitOption.FOLLOW_LINKS);

    @C12579k
    /* renamed from: a */
    public final LinkOption[] mo22683a(boolean z) {
        return z ? f28405c : f28404b;
    }

    @C12579k
    /* renamed from: b */
    public final Set<FileVisitOption> mo22684b(boolean z) {
        return z ? f28407e : f28406d;
    }
}
