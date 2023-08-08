package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16182c0;
import androidx.compose.p004ui.text.font.C16185d;
import androidx.compose.p004ui.text.font.C16201h0;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader */
public final class AndroidFontLoader implements C16227o0 {

    /* renamed from: a */
    public final Context f40199a;
    @C12580l

    /* renamed from: b */
    public final Object f40200b;

    public AndroidFontLoader(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f40199a = context.getApplicationContext();
    }

    @C12580l
    /* renamed from: b */
    public Object mo46755b() {
        return this.f40200b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo46756c(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16238t r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p004ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.p004ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.text.font.t r7 = (androidx.compose.p004ui.text.font.C16238t) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.p004ui.text.font.AndroidFontLoader) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0078
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005d
        L_0x0042:
            kotlin.C11661u0.m45747n(r8)
            boolean r8 = r7 instanceof androidx.compose.p004ui.text.font.C16185d
            if (r8 == 0) goto L_0x005e
            androidx.compose.ui.text.font.d r7 = (androidx.compose.p004ui.text.font.C16185d) r7
            androidx.compose.ui.text.font.d$a r8 = r7.mo46869c()
            android.content.Context r2 = r6.f40199a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.label = r4
            java.lang.Object r8 = r8.mo46871a(r2, r7, r0)
            if (r8 != r1) goto L_0x005d
            return r1
        L_0x005d:
            return r8
        L_0x005e:
            boolean r8 = r7 instanceof androidx.compose.p004ui.text.font.C16245u0
            if (r8 == 0) goto L_0x008a
            r8 = r7
            androidx.compose.ui.text.font.u0 r8 = (androidx.compose.p004ui.text.font.C16245u0) r8
            android.content.Context r2 = r6.f40199a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.p004ui.text.font.AndroidFontLoader_androidKt.m72828d(r8, r2, r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r0 = r6
        L_0x0078:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            androidx.compose.ui.text.font.u0 r7 = (androidx.compose.p004ui.text.font.C16245u0) r7
            androidx.compose.ui.text.font.h0$e r7 = r7.mo47017i()
            android.content.Context r0 = r0.f40199a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.graphics.Typeface r7 = androidx.compose.p004ui.text.font.C16241t0.m73160c(r8, r7, r0)
            return r7
        L_0x008a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AndroidFontLoader.mo46756c(androidx.compose.ui.text.font.t, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public Typeface mo46754a(@C12579k C16238t tVar) {
        Typeface typeface;
        Object obj;
        Intrinsics.checkNotNullParameter(tVar, "font");
        if (tVar instanceof C16185d) {
            C16185d dVar = (C16185d) tVar;
            C16185d.C16186a c = dVar.mo46869c();
            Context context = this.f40199a;
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            return c.mo46872b(context, dVar);
        }
        Object obj2 = null;
        if (!(tVar instanceof C16245u0)) {
            return null;
        }
        int a = tVar.mo46868a();
        C16182c0.C16183a aVar = C16182c0.f40243b;
        if (C16182c0.m72919g(a, aVar.mo46866b())) {
            Context context2 = this.f40199a;
            Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
            typeface = AndroidFontLoader_androidKt.m72827c((C16245u0) tVar, context2);
        } else if (C16182c0.m72919g(a, aVar.mo46867c())) {
            try {
                Result.C10852a aVar2 = Result.f28060a;
                Context context3 = this.f40199a;
                Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
                obj = Result.m38702b(AndroidFontLoader_androidKt.m72827c((C16245u0) tVar, context3));
            } catch (Throwable th) {
                Result.C10852a aVar3 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            if (!Result.m38709i(obj)) {
                obj2 = obj;
            }
            typeface = (Typeface) obj2;
        } else if (C16182c0.m72919g(a, aVar.mo46865a())) {
            throw new UnsupportedOperationException("Unsupported Async font load path");
        } else {
            throw new IllegalArgumentException("Unknown loading type " + C16182c0.m72921j(tVar.mo46868a()));
        }
        C16201h0.C16206e i = ((C16245u0) tVar).mo47017i();
        Context context4 = this.f40199a;
        Intrinsics.checkNotNullExpressionValue(context4, C9175a.f24932Y);
        return C16241t0.m73160c(typeface, i, context4);
    }
}
