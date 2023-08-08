package com.urbanairship.android.layout.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.C17318d;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.UAirship;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.ButtonModel;
import com.urbanairship.android.layout.model.C35799f;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.util.C35907b;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.C35977a;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.images.C9282f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/ImageButtonView;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/widget/n;", "Lkotlinx/coroutines/flow/e;", "Lkotlin/d2;", "e", "Landroid/view/View;", "changedView", "", "visibility", "onVisibilityChanged", "Lcom/urbanairship/android/layout/view/a$a;", "d", "Lcom/urbanairship/android/layout/view/a$a;", "visibilityChangeListener", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/f;", "model", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/f;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class ImageButtonView extends AppCompatImageButton implements C35977a, C36026n {
    @C12580l

    /* renamed from: d */
    public C35977a.C35978a f88845d;

    /* renamed from: com.urbanairship.android.layout.view.ImageButtonView$a */
    public static final class C35934a implements C35977a.C35978a {

        /* renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f88846a;

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<String> f88847b;

        /* renamed from: c */
        public final /* synthetic */ Context f88848c;

        /* renamed from: d */
        public final /* synthetic */ ImageButtonView f88849d;

        public C35934a(Ref.BooleanRef booleanRef, Ref.ObjectRef<String> objectRef, Context context, ImageButtonView imageButtonView) {
            this.f88846a = booleanRef;
            this.f88847b = objectRef;
            this.f88848c = context;
            this.f88849d = imageButtonView;
        }

        /* renamed from: a */
        public void mo107598a(int i) {
            if (i == 0) {
                Ref.BooleanRef booleanRef = this.f88846a;
                if (!booleanRef.element) {
                    ImageButtonView.m148142b(this.f88848c, this.f88849d, booleanRef, (String) this.f88847b.element);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.ImageButtonView$b */
    public static final class C35935b implements ButtonModel.C35732a {

        /* renamed from: a */
        public final /* synthetic */ ImageButtonView f88850a;

        public C35935b(ImageButtonView imageButtonView) {
            this.f88850a = imageButtonView;
        }

        /* renamed from: e */
        public void mo107040e() {
            C35916j.m148093k(this.f88850a);
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            ImageButtonView imageButtonView = this.f88850a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            imageButtonView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88850a.setEnabled(z);
        }
    }

    /* renamed from: com.urbanairship.android.layout.view.ImageButtonView$c */
    public /* synthetic */ class C35936c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Image.Type.values().length];
            iArr[Image.Type.URL.ordinal()] = 1;
            iArr[Image.Type.ICON.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageButtonView(@C12579k Context context, @C12579k C35799f fVar, @C12579k C35614p pVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        setBackground(C17318d.m79726i(context, C35625g.C35632g.ua_layout_imagebutton_ripple));
        setClickable(true);
        setFocusable(true);
        setPadding(0, 0, 0, 0);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        C35916j.m148085c(this, fVar);
        C35922n.m148121a(fVar.mo107031R(), new C11300l<String, C11079d2>(this) {
            final /* synthetic */ ImageButtonView this$0;

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
        Image a0 = fVar.mo107210a0();
        int i = C35936c.$EnumSwitchMapping$0[a0.mo107276b().ordinal()];
        if (i == 1) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Intrinsics.checkNotNull(a0, "null cannot be cast to non-null type com.urbanairship.android.layout.property.Image.Url");
            T d = ((Image.C35817b) a0).mo107281d();
            Intrinsics.checkNotNullExpressionValue(d, "image as Image.Url).url");
            objectRef.element = d;
            T t = pVar.mo106640b().get((String) objectRef.element);
            if (t != null) {
                objectRef.element = t;
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            m148142b(context, this, booleanRef, (String) objectRef.element);
            this.f88845d = new C35934a(booleanRef, objectRef, context, this);
        } else if (i == 2) {
            Intrinsics.checkNotNull(a0, "null cannot be cast to non-null type com.urbanairship.android.layout.property.Image.Icon");
            Image.Icon icon = (Image.Icon) a0;
            setImageDrawable(icon.mo107277d(context));
            int d2 = icon.mo107280g().mo107342d(context);
            int o = C35916j.m148097o(d2);
            int m = C35916j.m148095m(d2);
            setImageTintList(new C35907b().mo107549b(o, 16842919).mo107549b(m, -16842910).mo107548a(d2).mo107550c());
        }
        fVar.mo106988H(new C35935b(this));
    }

    /* renamed from: b */
    public static final void m148142b(Context context, ImageButtonView imageButtonView, Ref.BooleanRef booleanRef, String str) {
        UAirship.m146188Y().mo106229t().mo18651a(context, imageButtonView, C9282f.m34839f(str).mo18675h(new C35979b(booleanRef)).mo18673f());
    }

    /* renamed from: d */
    public static final void m148144d(Ref.BooleanRef booleanRef, boolean z) {
        Intrinsics.checkNotNullParameter(booleanRef, "$isLoaded");
        if (z) {
            booleanRef.element = true;
        }
    }

    @C12579k
    /* renamed from: e */
    public C11907e<C11079d2> mo107595e() {
        return ViewExtensionsKt.m148030e(this, 0, 1, (Object) null);
    }

    public void onVisibilityChanged(@C12579k View view, int i) {
        Intrinsics.checkNotNullParameter(view, "changedView");
        super.onVisibilityChanged(view, i);
        C35977a.C35978a aVar = this.f88845d;
        if (aVar != null) {
            aVar.mo107598a(i);
        }
    }
}
