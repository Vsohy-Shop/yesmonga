package com.urbanairship.android.layout.view;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.model.ScoreModel;
import com.urbanairship.android.layout.property.C35844o;
import com.urbanairship.android.layout.property.ScoreType;
import com.urbanairship.android.layout.util.C35908c;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0017\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010)¨\u00061"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/ScoreView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/widget/n;", "", "score", "Lkotlin/d2;", "setSelectedScore", "(Ljava/lang/Integer;)V", "Lkotlinx/coroutines/flow/e;", "e", "Lcom/urbanairship/android/layout/property/o$d;", "style", "Lcom/urbanairship/android/layout/util/c;", "constraints", "w", "Landroid/view/View;", "view", "y", "", "enabled", "z", "Lkotlinx/coroutines/channels/g;", "a", "Lkotlinx/coroutines/channels/g;", "clicksChannel", "Lcom/urbanairship/android/layout/view/ScoreView$b;", "b", "Lcom/urbanairship/android/layout/view/ScoreView$b;", "getScoreSelectedListener", "()Lcom/urbanairship/android/layout/view/ScoreView$b;", "setScoreSelectedListener", "(Lcom/urbanairship/android/layout/view/ScoreView$b;)V", "scoreSelectedListener", "Landroid/util/SparseIntArray;", "c", "Landroid/util/SparseIntArray;", "scoreToViewIds", "d", "Ljava/lang/Integer;", "selectedScore", "Z", "isEnabled", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/ScoreModel;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/ScoreModel;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class ScoreView extends ConstraintLayout implements C35977a, C36026n {
    @C12579k

    /* renamed from: a */
    public final C11744g<C11079d2> f88898a = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
    @C12580l

    /* renamed from: b */
    public C35962b f88899b;
    @C12579k

    /* renamed from: c */
    public final SparseIntArray f88900c = new SparseIntArray();
    @C12580l

    /* renamed from: d */
    public Integer f88901d;

    /* renamed from: e */
    public boolean f88902e = true;

    /* renamed from: com.urbanairship.android.layout.view.ScoreView$a */
    public static final class C35961a implements ScoreModel.C35772a {

        /* renamed from: a */
        public final /* synthetic */ ScoreView f88903a;

        public C35961a(ScoreView scoreView) {
            this.f88903a = scoreView;
        }

        /* renamed from: a */
        public void mo107141a(@C12580l Integer num) {
            if (num != null) {
                this.f88903a.setSelectedScore(Integer.valueOf(num.intValue()));
            }
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            ScoreView scoreView = this.f88903a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            scoreView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88903a.mo107630z(z);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.ScoreView$b */
    public interface C35962b {
        /* renamed from: a */
        void mo107589a(int i);
    }

    /* renamed from: com.urbanairship.android.layout.view.ScoreView$c */
    public /* synthetic */ class C35963c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScoreType.values().length];
            iArr[ScoreType.NUMBER_RANGE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScoreView(@C12579k Context context, @C12579k ScoreModel scoreModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(scoreModel, C40045d.f102104u);
        C35916j.m148085c(this, scoreModel);
        C35908c j = C35908c.m148057j(context);
        Intrinsics.checkNotNullExpressionValue(j, "newBuilder(context)");
        C35844o O = scoreModel.mo107135O();
        if (C35963c.$EnumSwitchMapping$0[O.mo107360b().ordinal()] == 1) {
            Intrinsics.checkNotNull(O, "null cannot be cast to non-null type com.urbanairship.android.layout.property.ScoreStyle.NumberRange");
            mo107628w((C35844o.C35848d) O, j);
        }
        j.mo107555c().mo50900r(this);
        C35922n.m148121a(scoreModel.mo107133M(), new C11300l<String, C11079d2>(this) {
            final /* synthetic */ ScoreView this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                this.this$0.setContentDescription(str);
            }
        });
        scoreModel.mo106988H(new C35961a(this));
    }

    /* renamed from: x */
    public static final void m148195x(ScoreView scoreView, int i, View view) {
        Intrinsics.checkNotNullParameter(scoreView, "this$0");
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        scoreView.mo107629y(view, i);
    }

    @C12579k
    /* renamed from: e */
    public C11907e<C11079d2> mo107595e() {
        return C11909g.m47490s1(this.f88898a);
    }

    @C12580l
    public final C35962b getScoreSelectedListener() {
        return this.f88899b;
    }

    public final void setScoreSelectedListener(@C12580l C35962b bVar) {
        this.f88899b = bVar;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSelectedScore(@org.jetbrains.annotations.C12580l java.lang.Integer r6) {
        /*
            r5 = this;
            r5.f88901d = r6
            r0 = 0
            if (r6 == 0) goto L_0x0025
            android.util.SparseIntArray r1 = r5.f88900c
            int r6 = r6.intValue()
            r2 = -1
            int r6 = r1.get(r6, r2)
            if (r6 <= r2) goto L_0x0042
            android.view.View r6 = r5.findViewById(r6)
            boolean r1 = r6 instanceof android.widget.Checkable
            if (r1 == 0) goto L_0x001d
            r0 = r6
            android.widget.Checkable r0 = (android.widget.Checkable) r0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0042
        L_0x0020:
            r6 = 1
            r0.setChecked(r6)
            goto L_0x0042
        L_0x0025:
            int r6 = r5.getChildCount()
            r1 = 0
            r2 = r1
        L_0x002b:
            if (r2 >= r6) goto L_0x0042
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r3 instanceof android.widget.Checkable
            if (r4 == 0) goto L_0x0038
            android.widget.Checkable r3 = (android.widget.Checkable) r3
            goto L_0x0039
        L_0x0038:
            r3 = r0
        L_0x0039:
            if (r3 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            r3.setChecked(r1)
        L_0x003f:
            int r2 = r2 + 1
            goto L_0x002b
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.view.ScoreView.setSelectedScore(java.lang.Integer):void");
    }

    /* renamed from: w */
    public final void mo107628w(C35844o.C35848d dVar, C35908c cVar) {
        C35908c cVar2 = cVar;
        C35844o.C35847c c = dVar.mo107365c();
        Intrinsics.checkNotNullExpressionValue(c, "style.bindings");
        int f = dVar.mo107368f();
        int d = dVar.mo107366d();
        int[] iArr = new int[((d - f) + 1)];
        if (f <= d) {
            int i = f;
            while (true) {
                ScoreView$configureNumberRange$button$1 scoreView$configureNumberRange$button$1 = new ScoreView$configureNumberRange$button$1(getContext(), c.mo107363b().mo107361b(), c.mo107364c().mo107361b(), String.valueOf(i), c.mo107363b().mo107362c(), c.mo107364c().mo107362c());
                int generateViewId = View.generateViewId();
                scoreView$configureNumberRange$button$1.setId(generateViewId);
                iArr[i - f] = generateViewId;
                this.f88900c.append(i, generateViewId);
                scoreView$configureNumberRange$button$1.setOnClickListener(new C35986i(this, i));
                cVar2.mo107566o(generateViewId);
                cVar2.mo107561i(generateViewId, 16);
                addView(scoreView$configureNumberRange$button$1, new ConstraintLayout.C16926b(0, 0));
                if (i == d) {
                    break;
                }
                i++;
            }
        }
        cVar2.mo107563l(iArr, 2).mo107558f(iArr, 0, dVar.mo107367e());
    }

    /* renamed from: y */
    public final void mo107629y(View view, int i) {
        Checkable checkable;
        boolean z;
        if (this.f88902e) {
            Integer num = this.f88901d;
            if (num == null || i != num.intValue()) {
                this.f88901d = Integer.valueOf(i);
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Checkable) {
                        checkable = (Checkable) childAt;
                    } else {
                        checkable = null;
                    }
                    if (checkable != null) {
                        if (view.getId() == childAt.getId()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        checkable.setChecked(z);
                    }
                }
                C35962b bVar = this.f88899b;
                if (bVar != null) {
                    bVar.mo107589a(i);
                }
                this.f88898a.mo23751L(C11079d2.f28267a);
            }
        }
    }

    /* renamed from: z */
    public final void mo107630z(boolean z) {
        this.f88902e = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }
}
