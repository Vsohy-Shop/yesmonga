package com.urbanairship.android.layout.shape;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.compose.material.OutlinedTextFieldKt;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.Image;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.widget.C36023m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.shape.a */
public class C35870a {

    /* renamed from: f */
    public static final int[] f88707f = {16842912};

    /* renamed from: g */
    public static final int[] f88708g = StateSet.NOTHING;
    @C0359n0

    /* renamed from: a */
    public final ShapeType f88709a;
    @C0363p0

    /* renamed from: b */
    public final C35835f f88710b;
    @C0363p0

    /* renamed from: c */
    public final C35830c f88711c;

    /* renamed from: d */
    public final float f88712d;

    /* renamed from: e */
    public final float f88713e;

    public C35870a(@C0359n0 ShapeType shapeType, float f, float f2, @C0363p0 C35830c cVar, @C0363p0 C35835f fVar) {
        this.f88709a = shapeType;
        this.f88712d = f;
        this.f88713e = f2;
        this.f88711c = cVar;
        this.f88710b = fVar;
    }

    @C0359n0
    /* renamed from: a */
    public static StateListDrawable m147949a(@C0359n0 Context context, @C0359n0 List<C35870a> list, @C0359n0 List<C35870a> list2, @C0363p0 Image.Icon icon, @C0363p0 Image.Icon icon2) {
        int i;
        int i2;
        int size = list.size();
        if (icon != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = size + i;
        Drawable[] drawableArr = new Drawable[i3];
        for (int i4 = 0; i4 < list.size(); i4++) {
            drawableArr[i4] = list.get(i4).mo107480f(context);
        }
        if (icon != null) {
            drawableArr[i3 - 1] = icon.mo107277d(context);
        }
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        int size2 = list2.size();
        if (icon2 != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = size2 + i2;
        Drawable[] drawableArr2 = new Drawable[i5];
        for (int i6 = 0; i6 < list2.size(); i6++) {
            drawableArr2[i6] = list2.get(i6).mo107480f(context);
        }
        if (icon2 != null) {
            drawableArr2[i5 - 1] = icon2.mo107277d(context);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f88707f, layerDrawable);
        stateListDrawable.addState(f88708g, layerDrawable2);
        return stateListDrawable;
    }

    @C0359n0
    /* renamed from: b */
    public static C35870a m147950b(@C0359n0 C9323b bVar) throws JsonException {
        return new C35870a(ShapeType.m147947b(bVar.mo18801A("type").mo18750B()), bVar.mo18801A("aspect_ratio").mo18760e(1.0f), bVar.mo18801A("scale").mo18760e(1.0f), C35830c.m147737a(bVar.mo18801A(OutlinedTextFieldKt.f7748c).mo18749A()), C35835f.m147757c(bVar, "color"));
    }

    /* renamed from: c */
    public float mo107477c() {
        return this.f88712d;
    }

    @C0363p0
    /* renamed from: d */
    public C35830c mo107478d() {
        return this.f88711c;
    }

    @C0363p0
    /* renamed from: e */
    public C35835f mo107479e() {
        return this.f88710b;
    }

    @C0359n0
    /* renamed from: f */
    public Drawable mo107480f(@C0359n0 Context context) {
        int i;
        int i2;
        float f;
        C35830c cVar = this.f88711c;
        int i3 = 0;
        if (cVar == null || cVar.mo107336d() == null) {
            i = 0;
        } else {
            i = (int) C35921m.m148111a(context, this.f88711c.mo107336d().intValue());
        }
        C35830c cVar2 = this.f88711c;
        if (cVar2 == null || cVar2.mo107335c() == null) {
            i2 = 0;
        } else {
            i2 = this.f88711c.mo107335c().mo107342d(context);
        }
        C35830c cVar3 = this.f88711c;
        if (cVar3 == null || cVar3.mo107334b() == null) {
            f = 0.0f;
        } else {
            f = C35921m.m148111a(context, this.f88711c.mo107334b().intValue());
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(this.f88709a.mo107475g());
        C35835f fVar = this.f88710b;
        if (fVar != null) {
            i3 = fVar.mo107342d(context);
        }
        gradientDrawable.setColor(i3);
        gradientDrawable.setStroke(i, i2);
        gradientDrawable.setCornerRadius(f);
        return new C36023m((Drawable) gradientDrawable, this.f88712d, this.f88713e);
    }

    /* renamed from: g */
    public float mo107481g() {
        return this.f88713e;
    }

    @C0359n0
    /* renamed from: h */
    public ShapeType mo107482h() {
        return this.f88709a;
    }
}
