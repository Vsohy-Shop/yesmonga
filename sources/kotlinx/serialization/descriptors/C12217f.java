package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12200d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.descriptors.f */
public interface C12217f {

    /* renamed from: kotlinx.serialization.descriptors.f$a */
    public static final class C12218a {
        @C12579k
        /* renamed from: a */
        public static List<Annotation> m48895a(@C12579k C12217f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "this");
            return CollectionsKt__CollectionsKt.m40441E();
        }

        @C12200d
        /* renamed from: b */
        public static /* synthetic */ void m48896b() {
        }

        @C12200d
        /* renamed from: c */
        public static /* synthetic */ void m48897c() {
        }

        @C12200d
        /* renamed from: d */
        public static /* synthetic */ void m48898d() {
        }

        @C12200d
        /* renamed from: e */
        public static /* synthetic */ void m48899e() {
        }

        /* renamed from: f */
        public static boolean m48900f(@C12579k C12217f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "this");
            return false;
        }

        @C12200d
        /* renamed from: g */
        public static /* synthetic */ void m48901g() {
        }

        /* renamed from: h */
        public static boolean m48902h(@C12579k C12217f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "this");
            return false;
        }

        @C12200d
        /* renamed from: i */
        public static /* synthetic */ void m48903i() {
        }
    }

    /* renamed from: b */
    boolean mo24821b();

    @C12200d
    /* renamed from: c */
    int mo24822c(@C12579k String str);

    /* renamed from: d */
    int mo24823d();

    @C12200d
    @C12579k
    /* renamed from: e */
    String mo24824e(int i);

    @C12200d
    @C12579k
    /* renamed from: f */
    List<Annotation> mo24826f(int i);

    @C12200d
    @C12579k
    /* renamed from: g */
    C12217f mo24827g(int i);

    @C12579k
    List<Annotation> getAnnotations();

    @C12579k
    C12224h getKind();

    @C12579k
    /* renamed from: h */
    String mo24830h();

    @C12200d
    /* renamed from: i */
    boolean mo24832i(int i);

    boolean isInline();
}
