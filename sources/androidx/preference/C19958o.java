package androidx.preference;

import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.preference.o */
public final class C19958o {

    /* renamed from: androidx.preference.o$a */
    public static final class C19959a implements C11559m<Preference> {

        /* renamed from: a */
        public final /* synthetic */ PreferenceGroup f51083a;

        public C19959a(PreferenceGroup preferenceGroup) {
            this.f51083a = preferenceGroup;
        }

        @C12579k
        public Iterator<Preference> iterator() {
            return C19958o.m92825j(this.f51083a);
        }
    }

    /* renamed from: androidx.preference.o$b */
    public static final class C19960b implements Iterator<Preference>, C11348d {

        /* renamed from: a */
        public int f51084a;

        /* renamed from: b */
        public final /* synthetic */ PreferenceGroup f51085b;

        public C19960b(PreferenceGroup preferenceGroup) {
            this.f51085b = preferenceGroup;
        }

        @C12579k
        /* renamed from: b */
        public Preference next() {
            PreferenceGroup preferenceGroup = this.f51085b;
            int i = this.f51084a;
            this.f51084a = i + 1;
            Preference p3 = preferenceGroup.mo58941p3(i);
            Intrinsics.checkNotNullExpressionValue(p3, "getPreference(index++)");
            return p3;
        }

        public boolean hasNext() {
            if (this.f51084a < this.f51085b.mo58942q3()) {
                return true;
            }
            return false;
        }

        public void remove() {
            PreferenceGroup preferenceGroup = this.f51085b;
            int i = this.f51084a - 1;
            this.f51084a = i;
            preferenceGroup.mo58948w3(preferenceGroup.mo58941p3(i));
        }
    }

    /* renamed from: a */
    public static final boolean m92816a(@C12579k PreferenceGroup preferenceGroup, @C12579k Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        int q3 = preferenceGroup.mo58942q3();
        int i = 0;
        while (i < q3) {
            int i2 = i + 1;
            if (Intrinsics.areEqual((Object) preferenceGroup.mo58941p3(i), (Object) preference)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m92817b(@C12579k PreferenceGroup preferenceGroup, @C12579k C11300l<? super Preference, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        int q3 = preferenceGroup.mo58942q3();
        for (int i = 0; i < q3; i++) {
            lVar.invoke(m92819d(preferenceGroup, i));
        }
    }

    /* renamed from: c */
    public static final void m92818c(@C12579k PreferenceGroup preferenceGroup, @C12579k C11304p<? super Integer, ? super Preference, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int q3 = preferenceGroup.mo58942q3();
        for (int i = 0; i < q3; i++) {
            pVar.invoke(Integer.valueOf(i), m92819d(preferenceGroup, i));
        }
    }

    @C12579k
    /* renamed from: d */
    public static final Preference m92819d(@C12579k PreferenceGroup preferenceGroup, int i) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Preference p3 = preferenceGroup.mo58941p3(i);
        Intrinsics.checkNotNullExpressionValue(p3, "getPreference(index)");
        return p3;
    }

    @C12580l
    /* renamed from: e */
    public static final <T extends Preference> T m92820e(@C12579k PreferenceGroup preferenceGroup, @C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "key");
        return preferenceGroup.mo58938m3(charSequence);
    }

    @C12579k
    /* renamed from: f */
    public static final C11559m<Preference> m92821f(@C12579k PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return new C19959a(preferenceGroup);
    }

    /* renamed from: g */
    public static final int m92822g(@C12579k PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return preferenceGroup.mo58942q3();
    }

    /* renamed from: h */
    public static final boolean m92823h(@C12579k PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        if (preferenceGroup.mo58942q3() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m92824i(@C12579k PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        if (preferenceGroup.mo58942q3() != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: j */
    public static final Iterator<Preference> m92825j(@C12579k PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return new C19960b(preferenceGroup);
    }

    /* renamed from: k */
    public static final void m92826k(@C12579k PreferenceGroup preferenceGroup, @C12579k Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        preferenceGroup.mo58948w3(preference);
    }

    /* renamed from: l */
    public static final void m92827l(@C12579k PreferenceGroup preferenceGroup, @C12579k Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        preferenceGroup.mo58937l3(preference);
    }
}
