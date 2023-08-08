package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C2840p;
import androidx.compose.foundation.text.selection.C2843s;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004ui.input.key.C15437c;
import androidx.compose.p004ui.input.key.C15439d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16280c;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16293h;
import androidx.compose.p004ui.text.input.C16302l;
import androidx.compose.p004ui.text.input.EditProcessor;
import androidx.compose.p004ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TextFieldKeyInput {
    @C12579k

    /* renamed from: a */
    public final TextFieldState f7188a;
    @C12579k

    /* renamed from: b */
    public final TextFieldSelectionManager f7189b;
    @C12579k

    /* renamed from: c */
    public final TextFieldValue f7190c;

    /* renamed from: d */
    public final boolean f7191d;

    /* renamed from: e */
    public final boolean f7192e;
    @C12579k

    /* renamed from: f */
    public final C2843s f7193f;
    @C12579k

    /* renamed from: g */
    public final C16281c0 f7194g;
    @C12580l

    /* renamed from: h */
    public final C2763c0 f7195h;
    @C12579k

    /* renamed from: i */
    public final C2758a f7196i;
    @C12579k

    /* renamed from: j */
    public final C2771g f7197j;
    @C12579k

    /* renamed from: k */
    public final C11300l<TextFieldValue, C11079d2> f7198k;

    public TextFieldKeyInput(@C12579k TextFieldState textFieldState, @C12579k TextFieldSelectionManager textFieldSelectionManager, @C12579k TextFieldValue textFieldValue, boolean z, boolean z2, @C12579k C2843s sVar, @C12579k C16281c0 c0Var, @C12580l C2763c0 c0Var2, @C12579k C2758a aVar, @C12579k C2771g gVar, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(textFieldState, "state");
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        Intrinsics.checkNotNullParameter(sVar, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
        Intrinsics.checkNotNullParameter(aVar, "keyCombiner");
        Intrinsics.checkNotNullParameter(gVar, "keyMapping");
        Intrinsics.checkNotNullParameter(lVar, "onValueChange");
        this.f7188a = textFieldState;
        this.f7189b = textFieldSelectionManager;
        this.f7190c = textFieldValue;
        this.f7191d = z;
        this.f7192e = z2;
        this.f7193f = sVar;
        this.f7194g = c0Var;
        this.f7195h = c0Var2;
        this.f7196i = aVar;
        this.f7197j = gVar;
        this.f7198k = lVar;
    }

    /* renamed from: d */
    public final void mo9379d(C16293h hVar) {
        mo9380e(C10976s.m41419k(hVar));
    }

    /* renamed from: e */
    public final void mo9380e(List<? extends C16293h> list) {
        EditProcessor k = this.f7188a.mo9447k();
        List T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        T5.add(0, new C16302l());
        this.f7198k.invoke(k.mo47076b(T5));
    }

    /* renamed from: f */
    public final void mo9381f(C11300l<? super C2840p, C11079d2> lVar) {
        C2840p pVar = new C2840p(this.f7190c, this.f7194g, this.f7188a.mo9443g(), this.f7193f);
        lVar.invoke(pVar);
        if (!C16356n0.m73735g(pVar.mo9788B(), this.f7190c.mo47113h()) || !Intrinsics.areEqual((Object) pVar.mo9824g(), (Object) this.f7190c.mo47111f())) {
            this.f7198k.invoke(pVar.mo9899k0());
        }
    }

    /* renamed from: g */
    public final boolean mo9382g() {
        return this.f7191d;
    }

    @C12579k
    /* renamed from: h */
    public final C16281c0 mo9383h() {
        return this.f7194g;
    }

    @C12579k
    /* renamed from: i */
    public final C2843s mo9384i() {
        return this.f7193f;
    }

    @C12579k
    /* renamed from: j */
    public final TextFieldSelectionManager mo9385j() {
        return this.f7189b;
    }

    /* renamed from: k */
    public final boolean mo9386k() {
        return this.f7192e;
    }

    @C12579k
    /* renamed from: l */
    public final TextFieldState mo9387l() {
        return this.f7188a;
    }

    @C12580l
    /* renamed from: m */
    public final C2763c0 mo9388m() {
        return this.f7195h;
    }

    @C12579k
    /* renamed from: n */
    public final TextFieldValue mo9389n() {
        return this.f7190c;
    }

    /* renamed from: o */
    public final boolean mo9390o(@C12579k KeyEvent keyEvent) {
        KeyCommand a;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        C16280c p = mo9391p(keyEvent);
        if (p != null) {
            if (!this.f7191d) {
                return false;
            }
            mo9379d(p);
            this.f7193f.mo9904b();
            return true;
        } else if (!C15437c.m68266g(C15439d.m68274b(keyEvent), C15437c.f38419b.mo43929a()) || (a = this.f7197j.mo9313a(keyEvent)) == null || (a.mo9312q() && !this.f7191d)) {
            return false;
        } else {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            mo9381f(new TextFieldKeyInput$process$2(a, this, booleanRef));
            C2763c0 c0Var = this.f7195h;
            if (c0Var != null) {
                c0Var.mo9502a();
            }
            return booleanRef.element;
        }
    }

    /* renamed from: p */
    public final C16280c mo9391p(KeyEvent keyEvent) {
        Integer a;
        if (!C2848v.m13132a(keyEvent) || (a = this.f7196i.mo9499a(keyEvent)) == null) {
            return null;
        }
        String sb = C2784q.m12641a(new StringBuilder(), a.intValue()).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new C16280c(sb, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.TextFieldState r22, androidx.compose.foundation.text.selection.TextFieldSelectionManager r23, androidx.compose.p004ui.text.input.TextFieldValue r24, boolean r25, boolean r26, androidx.compose.foundation.text.selection.C2843s r27, androidx.compose.p004ui.text.input.C16281c0 r28, androidx.compose.foundation.text.C2763c0 r29, androidx.compose.foundation.text.C2758a r30, androidx.compose.foundation.text.C2771g r31, kotlin.jvm.functions.C11300l r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r21 = this;
            r0 = r33
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            androidx.compose.ui.text.input.TextFieldValue r1 = new androidx.compose.ui.text.input.TextFieldValue
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r2 = r1
            r2.<init>((java.lang.String) r3, (long) r4, (androidx.compose.p004ui.text.C16356n0) r6, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r8)
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r24
        L_0x0016:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            r1 = 1
            r13 = r1
            goto L_0x001f
        L_0x001d:
            r13 = r25
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            r1 = 0
            r14 = r1
            goto L_0x0028
        L_0x0026:
            r14 = r26
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0035
            androidx.compose.ui.text.input.c0$a r1 = androidx.compose.p004ui.text.input.C16281c0.f40467a
            androidx.compose.ui.text.input.c0 r1 = r1.mo47176a()
            r16 = r1
            goto L_0x0037
        L_0x0035:
            r16 = r28
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r17 = r1
            goto L_0x0041
        L_0x003f:
            r17 = r29
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            androidx.compose.foundation.text.g r1 = androidx.compose.foundation.text.C2773h.m12580a()
            r19 = r1
            goto L_0x004e
        L_0x004c:
            r19 = r31
        L_0x004e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0057
            androidx.compose.foundation.text.TextFieldKeyInput$1 r0 = androidx.compose.foundation.text.TextFieldKeyInput.C27331.f7199f
            r20 = r0
            goto L_0x0059
        L_0x0057:
            r20 = r32
        L_0x0059:
            r9 = r21
            r10 = r22
            r11 = r23
            r15 = r27
            r18 = r30
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldKeyInput.<init>(androidx.compose.foundation.text.TextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, androidx.compose.foundation.text.selection.s, androidx.compose.ui.text.input.c0, androidx.compose.foundation.text.c0, androidx.compose.foundation.text.a, androidx.compose.foundation.text.g, kotlin.jvm.functions.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
