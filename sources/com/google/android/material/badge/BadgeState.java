package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0330d1;
import androidx.annotation.C0336f;
import androidx.annotation.C0351j1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0370s0;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;
import com.google.android.material.drawable.C31332a;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31500c;
import com.google.android.material.resources.C31501d;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* renamed from: f */
    public static final int f74596f = 4;

    /* renamed from: g */
    public static final String f74597g = "badge";

    /* renamed from: a */
    public final State f74598a;

    /* renamed from: b */
    public final State f74599b;

    /* renamed from: c */
    public final float f74600c;

    /* renamed from: d */
    public final float f74601d;

    /* renamed from: e */
    public final float f74602e;

    public BadgeState(Context context, @C0351j1 int i, @C0336f int i2, @C0327c1 int i3, @C0363p0 State state) {
        int i4;
        CharSequence charSequence;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        State state2 = new State();
        this.f74599b = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            int unused = state.f74611a = i;
        }
        TypedArray b = mo88169b(context, state.f74611a, i2, i3);
        Resources resources = context.getResources();
        this.f74600c = (float) b.getDimensionPixelSize(C31076a.C31091o.Badge_badgeRadius, resources.getDimensionPixelSize(C31076a.C31082f.mtrl_badge_radius));
        this.f74602e = (float) b.getDimensionPixelSize(C31076a.C31091o.Badge_badgeWidePadding, resources.getDimensionPixelSize(C31076a.C31082f.mtrl_badge_long_text_horizontal_padding));
        this.f74601d = (float) b.getDimensionPixelSize(C31076a.C31091o.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(C31076a.C31082f.mtrl_badge_with_text_radius));
        if (state.f74614d == -2) {
            i4 = 255;
        } else {
            i4 = state.f74614d;
        }
        int unused2 = state2.f74614d = i4;
        if (state.f74618v == null) {
            charSequence = context.getString(C31076a.C31089m.mtrl_badge_numberless_content_description);
        } else {
            charSequence = state.f74618v;
        }
        CharSequence unused3 = state2.f74618v = charSequence;
        if (state.f74619w == 0) {
            i5 = C31076a.C31088l.mtrl_badge_content_description;
        } else {
            i5 = state.f74619w;
        }
        int unused4 = state2.f74619w = i5;
        if (state.f74620x == 0) {
            i6 = C31076a.C31089m.mtrl_exceed_max_badge_number_content_description;
        } else {
            i6 = state.f74620x;
        }
        int unused5 = state2.f74620x = i6;
        int i15 = 0;
        if (state.f74622z == null || state.f74622z.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean unused6 = state2.f74622z = Boolean.valueOf(z);
        if (state.f74616f == -2) {
            i7 = b.getInt(C31076a.C31091o.Badge_maxCharacterCount, 4);
        } else {
            i7 = state.f74616f;
        }
        int unused7 = state2.f74616f = i7;
        if (state.f74615e != -2) {
            int unused8 = state2.f74615e = state.f74615e;
        } else {
            int i16 = C31076a.C31091o.Badge_number;
            if (b.hasValue(i16)) {
                int unused9 = state2.f74615e = b.getInt(i16, 0);
            } else {
                int unused10 = state2.f74615e = -1;
            }
        }
        if (state.f74612b == null) {
            i8 = m124918v(context, b, C31076a.C31091o.Badge_backgroundColor);
        } else {
            i8 = state.f74612b.intValue();
        }
        Integer unused11 = state2.f74612b = Integer.valueOf(i8);
        if (state.f74613c != null) {
            Integer unused12 = state2.f74613c = state.f74613c;
        } else {
            int i17 = C31076a.C31091o.Badge_badgeTextColor;
            if (b.hasValue(i17)) {
                Integer unused13 = state2.f74613c = Integer.valueOf(m124918v(context, b, i17));
            } else {
                Integer unused14 = state2.f74613c = Integer.valueOf(new C31501d(context, C31076a.C31090n.TextAppearance_MaterialComponents_Badge).mo90649i().getDefaultColor());
            }
        }
        if (state.f74621y == null) {
            i9 = b.getInt(C31076a.C31091o.Badge_badgeGravity, 8388661);
        } else {
            i9 = state.f74621y.intValue();
        }
        Integer unused15 = state2.f74621y = Integer.valueOf(i9);
        if (state.f74608X == null) {
            i10 = b.getDimensionPixelOffset(C31076a.C31091o.Badge_horizontalOffset, 0);
        } else {
            i10 = state.f74608X.intValue();
        }
        Integer unused16 = state2.f74608X = Integer.valueOf(i10);
        if (state.f74608X == null) {
            i11 = b.getDimensionPixelOffset(C31076a.C31091o.Badge_verticalOffset, 0);
        } else {
            i11 = state.f74609Y.intValue();
        }
        Integer unused17 = state2.f74609Y = Integer.valueOf(i11);
        if (state.f74610Z == null) {
            i12 = b.getDimensionPixelOffset(C31076a.C31091o.Badge_horizontalOffsetWithText, state2.f74608X.intValue());
        } else {
            i12 = state.f74610Z.intValue();
        }
        Integer unused18 = state2.f74610Z = Integer.valueOf(i12);
        if (state.f74605E0 == null) {
            i13 = b.getDimensionPixelOffset(C31076a.C31091o.Badge_verticalOffsetWithText, state2.f74609Y.intValue());
        } else {
            i13 = state.f74605E0.intValue();
        }
        Integer unused19 = state2.f74605E0 = Integer.valueOf(i13);
        if (state.f74606F0 == null) {
            i14 = 0;
        } else {
            i14 = state.f74606F0.intValue();
        }
        Integer unused20 = state2.f74606F0 = Integer.valueOf(i14);
        Integer unused21 = state2.f74607G0 = Integer.valueOf(state.f74607G0 != null ? state.f74607G0.intValue() : i15);
        b.recycle();
        if (state.f74617g == null) {
            Locale unused22 = state2.f74617g = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            Locale unused23 = state2.f74617g = state.f74617g;
        }
        this.f74598a = state;
    }

    /* renamed from: v */
    public static int m124918v(Context context, @C0359n0 TypedArray typedArray, @C0330d1 int i) {
        return C31500c.m127363a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: A */
    public void mo88155A(int i) {
        Integer unused = this.f74598a.f74621y = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74621y = Integer.valueOf(i);
    }

    /* renamed from: B */
    public void mo88156B(@C0354l int i) {
        Integer unused = this.f74598a.f74613c = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74613c = Integer.valueOf(i);
    }

    /* renamed from: C */
    public void mo88157C(@C0324b1 int i) {
        int unused = this.f74598a.f74620x = i;
        int unused2 = this.f74599b.f74620x = i;
    }

    /* renamed from: D */
    public void mo88158D(CharSequence charSequence) {
        CharSequence unused = this.f74598a.f74618v = charSequence;
        CharSequence unused2 = this.f74599b.f74618v = charSequence;
    }

    /* renamed from: E */
    public void mo88159E(@C0370s0 int i) {
        int unused = this.f74598a.f74619w = i;
        int unused2 = this.f74599b.f74619w = i;
    }

    /* renamed from: F */
    public void mo88160F(@C0366r(unit = 1) int i) {
        Integer unused = this.f74598a.f74610Z = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74610Z = Integer.valueOf(i);
    }

    /* renamed from: G */
    public void mo88161G(@C0366r(unit = 1) int i) {
        Integer unused = this.f74598a.f74608X = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74608X = Integer.valueOf(i);
    }

    /* renamed from: H */
    public void mo88162H(int i) {
        int unused = this.f74598a.f74616f = i;
        int unused2 = this.f74599b.f74616f = i;
    }

    /* renamed from: I */
    public void mo88163I(int i) {
        int unused = this.f74598a.f74615e = i;
        int unused2 = this.f74599b.f74615e = i;
    }

    /* renamed from: J */
    public void mo88164J(Locale locale) {
        Locale unused = this.f74598a.f74617g = locale;
        Locale unused2 = this.f74599b.f74617g = locale;
    }

    /* renamed from: K */
    public void mo88165K(@C0366r(unit = 1) int i) {
        Integer unused = this.f74598a.f74605E0 = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74605E0 = Integer.valueOf(i);
    }

    /* renamed from: L */
    public void mo88166L(@C0366r(unit = 1) int i) {
        Integer unused = this.f74598a.f74609Y = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74609Y = Integer.valueOf(i);
    }

    /* renamed from: M */
    public void mo88167M(boolean z) {
        Boolean unused = this.f74598a.f74622z = Boolean.valueOf(z);
        Boolean unused2 = this.f74599b.f74622z = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo88168a() {
        mo88163I(-1);
    }

    /* renamed from: b */
    public final TypedArray mo88169b(Context context, @C0351j1 int i, @C0336f int i2, @C0327c1 int i3) {
        AttributeSet attributeSet;
        int i4;
        int i5;
        if (i != 0) {
            AttributeSet a = C31332a.m126388a(context, i, f74597g);
            i4 = a.getStyleAttribute();
            attributeSet = a;
        } else {
            attributeSet = null;
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = i3;
        } else {
            i5 = i4;
        }
        return C31422p.m126970j(context, attributeSet, C31076a.C31091o.Badge, i2, i5, new int[0]);
    }

    @C0366r(unit = 1)
    /* renamed from: c */
    public int mo88170c() {
        return this.f74599b.f74606F0.intValue();
    }

    @C0366r(unit = 1)
    /* renamed from: d */
    public int mo88171d() {
        return this.f74599b.f74607G0.intValue();
    }

    /* renamed from: e */
    public int mo88172e() {
        return this.f74599b.f74614d;
    }

    @C0354l
    /* renamed from: f */
    public int mo88173f() {
        return this.f74599b.f74612b.intValue();
    }

    /* renamed from: g */
    public int mo88174g() {
        return this.f74599b.f74621y.intValue();
    }

    @C0354l
    /* renamed from: h */
    public int mo88175h() {
        return this.f74599b.f74613c.intValue();
    }

    @C0324b1
    /* renamed from: i */
    public int mo88176i() {
        return this.f74599b.f74620x;
    }

    /* renamed from: j */
    public CharSequence mo88177j() {
        return this.f74599b.f74618v;
    }

    @C0370s0
    /* renamed from: k */
    public int mo88178k() {
        return this.f74599b.f74619w;
    }

    @C0366r(unit = 1)
    /* renamed from: l */
    public int mo88179l() {
        return this.f74599b.f74610Z.intValue();
    }

    @C0366r(unit = 1)
    /* renamed from: m */
    public int mo88180m() {
        return this.f74599b.f74608X.intValue();
    }

    /* renamed from: n */
    public int mo88181n() {
        return this.f74599b.f74616f;
    }

    /* renamed from: o */
    public int mo88182o() {
        return this.f74599b.f74615e;
    }

    /* renamed from: p */
    public Locale mo88183p() {
        return this.f74599b.f74617g;
    }

    /* renamed from: q */
    public State mo88184q() {
        return this.f74598a;
    }

    @C0366r(unit = 1)
    /* renamed from: r */
    public int mo88185r() {
        return this.f74599b.f74605E0.intValue();
    }

    @C0366r(unit = 1)
    /* renamed from: s */
    public int mo88186s() {
        return this.f74599b.f74609Y.intValue();
    }

    /* renamed from: t */
    public boolean mo88187t() {
        return this.f74599b.f74615e != -1;
    }

    /* renamed from: u */
    public boolean mo88188u() {
        return this.f74599b.f74622z.booleanValue();
    }

    /* renamed from: w */
    public void mo88189w(@C0366r(unit = 1) int i) {
        Integer unused = this.f74598a.f74606F0 = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74606F0 = Integer.valueOf(i);
    }

    /* renamed from: x */
    public void mo88190x(@C0366r(unit = 1) int i) {
        Integer unused = this.f74598a.f74607G0 = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74607G0 = Integer.valueOf(i);
    }

    /* renamed from: y */
    public void mo88191y(int i) {
        int unused = this.f74598a.f74614d = i;
        int unused2 = this.f74599b.f74614d = i;
    }

    /* renamed from: z */
    public void mo88192z(@C0354l int i) {
        Integer unused = this.f74598a.f74612b = Integer.valueOf(i);
        Integer unused2 = this.f74599b.f74612b = Integer.valueOf(i);
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new C31131a();

        /* renamed from: H0 */
        public static final int f74603H0 = -1;

        /* renamed from: I0 */
        public static final int f74604I0 = -2;
        @C0366r(unit = 1)

        /* renamed from: E0 */
        public Integer f74605E0;
        @C0366r(unit = 1)

        /* renamed from: F0 */
        public Integer f74606F0;
        @C0366r(unit = 1)

        /* renamed from: G0 */
        public Integer f74607G0;
        @C0366r(unit = 1)

        /* renamed from: X */
        public Integer f74608X;
        @C0366r(unit = 1)

        /* renamed from: Y */
        public Integer f74609Y;
        @C0366r(unit = 1)

        /* renamed from: Z */
        public Integer f74610Z;
        @C0351j1

        /* renamed from: a */
        public int f74611a;
        @C0354l

        /* renamed from: b */
        public Integer f74612b;
        @C0354l

        /* renamed from: c */
        public Integer f74613c;

        /* renamed from: d */
        public int f74614d = 255;

        /* renamed from: e */
        public int f74615e = -2;

        /* renamed from: f */
        public int f74616f = -2;

        /* renamed from: g */
        public Locale f74617g;
        @C0363p0

        /* renamed from: v */
        public CharSequence f74618v;
        @C0370s0

        /* renamed from: w */
        public int f74619w;
        @C0324b1

        /* renamed from: x */
        public int f74620x;

        /* renamed from: y */
        public Integer f74621y;

        /* renamed from: z */
        public Boolean f74622z = Boolean.TRUE;

        /* renamed from: com.google.android.material.badge.BadgeState$State$a */
        public class C31131a implements Parcelable.Creator<State> {
            @C0359n0
            /* renamed from: a */
            public State createFromParcel(@C0359n0 Parcel parcel) {
                return new State(parcel);
            }

            @C0359n0
            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            String str;
            parcel.writeInt(this.f74611a);
            parcel.writeSerializable(this.f74612b);
            parcel.writeSerializable(this.f74613c);
            parcel.writeInt(this.f74614d);
            parcel.writeInt(this.f74615e);
            parcel.writeInt(this.f74616f);
            CharSequence charSequence = this.f74618v;
            if (charSequence == null) {
                str = null;
            } else {
                str = charSequence.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f74619w);
            parcel.writeSerializable(this.f74621y);
            parcel.writeSerializable(this.f74608X);
            parcel.writeSerializable(this.f74609Y);
            parcel.writeSerializable(this.f74610Z);
            parcel.writeSerializable(this.f74605E0);
            parcel.writeSerializable(this.f74606F0);
            parcel.writeSerializable(this.f74607G0);
            parcel.writeSerializable(this.f74622z);
            parcel.writeSerializable(this.f74617g);
        }

        public State(@C0359n0 Parcel parcel) {
            this.f74611a = parcel.readInt();
            this.f74612b = (Integer) parcel.readSerializable();
            this.f74613c = (Integer) parcel.readSerializable();
            this.f74614d = parcel.readInt();
            this.f74615e = parcel.readInt();
            this.f74616f = parcel.readInt();
            this.f74618v = parcel.readString();
            this.f74619w = parcel.readInt();
            this.f74621y = (Integer) parcel.readSerializable();
            this.f74608X = (Integer) parcel.readSerializable();
            this.f74609Y = (Integer) parcel.readSerializable();
            this.f74610Z = (Integer) parcel.readSerializable();
            this.f74605E0 = (Integer) parcel.readSerializable();
            this.f74606F0 = (Integer) parcel.readSerializable();
            this.f74607G0 = (Integer) parcel.readSerializable();
            this.f74622z = (Boolean) parcel.readSerializable();
            this.f74617g = (Locale) parcel.readSerializable();
        }
    }
}
