package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.C0337f0;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0375v;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;
import java.util.ArrayList;
import java.util.List;

public class RangeSlider extends BaseSlider<RangeSlider, C31564b, C31565c> {

    /* renamed from: L1 */
    public float f76587L1;

    /* renamed from: M1 */
    public int f76588M1;

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new C31562a();

        /* renamed from: a */
        public float f76589a;

        /* renamed from: b */
        public int f76590b;

        /* renamed from: com.google.android.material.slider.RangeSlider$RangeSliderState$a */
        public class C31562a implements Parcelable.Creator<RangeSliderState> {
            /* renamed from: a */
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            /* renamed from: b */
            public RangeSliderState[] newArray(int i) {
                return new RangeSliderState[i];
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f76589a);
            parcel.writeInt(this.f76590b);
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f76589a = parcel.readFloat();
            this.f76590b = parcel.readInt();
        }
    }

    /* renamed from: com.google.android.material.slider.RangeSlider$b */
    public interface C31564b extends C31568a<RangeSlider> {
        /* renamed from: a */
        void mo91107a(@C0359n0 RangeSlider rangeSlider, float f, boolean z);
    }

    /* renamed from: com.google.android.material.slider.RangeSlider$c */
    public interface C31565c extends C31569b<RangeSlider> {
        /* renamed from: b */
        void mo91108b(@C0359n0 RangeSlider rangeSlider);

        /* renamed from: d */
        void mo91109d(@C0359n0 RangeSlider rangeSlider);
    }

    public RangeSlider(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: F0 */
    public static List<Float> m127835F0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    /* renamed from: M */
    public /* bridge */ /* synthetic */ boolean mo90957M() {
        return super.mo90957M();
    }

    /* renamed from: S */
    public /* bridge */ /* synthetic */ boolean mo90963S() {
        return super.mo90963S();
    }

    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@C0359n0 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@C0359n0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @C0359n0
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @C0366r
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    public float getMinSeparation() {
        return this.f76587L1;
    }

    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @C0366r
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @C0366r
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @C0366r
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @C0359n0
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @C0366r
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @C0359n0
    public List<Float> getValues() {
        return super.getValues();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo91005h(@C0359n0 C31568a aVar) {
        super.mo91005h(aVar);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo91007i(@C0359n0 C31569b bVar) {
        super.mo91007i(bVar);
    }

    /* renamed from: i0 */
    public /* bridge */ /* synthetic */ void mo91008i0(@C0359n0 C31568a aVar) {
        super.mo91008i0(aVar);
    }

    /* renamed from: j0 */
    public /* bridge */ /* synthetic */ void mo91010j0(@C0359n0 C31569b bVar) {
        super.mo91010j0(bVar);
    }

    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @C0359n0 KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @C0359n0 KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public void onRestoreInstanceState(@C0363p0 Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f76587L1 = rangeSliderState.f76589a;
        int c = rangeSliderState.f76590b;
        this.f76588M1 = c;
        setSeparationUnit(c);
    }

    @C0359n0
    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        float unused = rangeSliderState.f76589a = this.f76587L1;
        int unused2 = rangeSliderState.f76590b = this.f76588M1;
        return rangeSliderState;
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(@C0359n0 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo91032p() {
        super.mo91032p();
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ void mo91034q() {
        super.mo91034q();
    }

    public void setCustomThumbDrawable(@C0375v int i) {
        super.setCustomThumbDrawable(i);
    }

    public void setCustomThumbDrawablesForValues(@C0375v @C0359n0 int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    public /* bridge */ /* synthetic */ void setHaloRadius(@C0366r @C0337f0(from = 0) int i) {
        super.setHaloRadius(i);
    }

    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@C0364q int i) {
        super.setHaloRadiusResource(i);
    }

    public /* bridge */ /* synthetic */ void setHaloTintList(@C0359n0 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(@C0363p0 C31571d dVar) {
        super.setLabelFormatter(dVar);
    }

    public void setMinSeparation(@C0366r float f) {
        this.f76587L1 = f;
        this.f76588M1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.f76587L1 = f;
        this.f76588M1 = 1;
        setSeparationUnit(1);
    }

    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public /* bridge */ /* synthetic */ void setThumbElevationResource(@C0364q int i) {
        super.setThumbElevationResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbRadius(@C0366r @C0337f0(from = 0) int i) {
        super.setThumbRadius(i);
    }

    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@C0364q int i) {
        super.setThumbRadiusResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@C0363p0 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@C0358n int i) {
        super.setThumbStrokeColorResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@C0364q int i) {
        super.setThumbStrokeWidthResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbTintList(@C0359n0 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickActiveTintList(@C0359n0 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@C0359n0 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickTintList(@C0359n0 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@C0359n0 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackHeight(@C0366r @C0337f0(from = 0) int i) {
        super.setTrackHeight(i);
    }

    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@C0359n0 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackTintList(@C0359n0 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    public void setValues(@C0359n0 Float... fArr) {
        super.setValues(fArr);
    }

    public RangeSlider(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.sliderStyle);
    }

    public void setCustomThumbDrawable(@C0359n0 Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    public void setCustomThumbDrawablesForValues(@C0359n0 Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setValues(@C0359n0 List<Float> list) {
        super.setValues(list);
    }

    public RangeSlider(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.RangeSlider, i, BaseSlider.f76508G1, new int[0]);
        int i2 = C31076a.C31091o.RangeSlider_values;
        if (j.hasValue(i2)) {
            setValues(m127835F0(j.getResources().obtainTypedArray(j.getResourceId(i2, 0))));
        }
        this.f76587L1 = j.getDimension(C31076a.C31091o.RangeSlider_minSeparation, 0.0f);
        j.recycle();
    }
}
