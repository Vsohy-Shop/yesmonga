package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SaverKt {
    @C12579k

    /* renamed from: a */
    public static final C8628e<Object, Object> f23105a = m31375a(SaverKt$AutoSaver$1.f23108f, SaverKt$AutoSaver$2.f23109f);

    /* renamed from: androidx.compose.runtime.saveable.SaverKt$a */
    public static final class C8621a implements C8628e<Original, Saveable> {

        /* renamed from: a */
        public final /* synthetic */ C11304p<C8629f, Original, Saveable> f23106a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Saveable, Original> f23107b;

        public C8621a(C11304p<? super C8629f, ? super Original, ? extends Saveable> pVar, C11300l<? super Saveable, ? extends Original> lVar) {
            this.f23106a = pVar;
            this.f23107b = lVar;
        }

        @C12580l
        /* renamed from: a */
        public Saveable mo16406a(@C12579k C8629f fVar, Original original) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            return this.f23106a.invoke(fVar, original);
        }

        @C12580l
        /* renamed from: b */
        public Original mo16407b(@C12579k Saveable saveable) {
            Intrinsics.checkNotNullParameter(saveable, "value");
            return this.f23107b.invoke(saveable);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <Original, Saveable> C8628e<Original, Saveable> m31375a(@C12579k C11304p<? super C8629f, ? super Original, ? extends Saveable> pVar, @C12579k C11300l<? super Saveable, ? extends Original> lVar) {
        Intrinsics.checkNotNullParameter(pVar, "save");
        Intrinsics.checkNotNullParameter(lVar, "restore");
        return new C8621a(pVar, lVar);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C8628e<T, Object> m31376b() {
        C8628e<Object, Object> eVar = f23105a;
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return eVar;
    }
}
