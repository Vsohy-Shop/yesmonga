package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.internal.C33541p;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b$\u0010'J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0014\u0010\u001fR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006("}, mo22516d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/s;", "viewModel", "Landroidx/navigation/NavBackStackEntry;", "e", "", "describeContents", "Landroid/os/Parcel;", "parcel", "i", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "b", "I", "()I", "destinationId", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "args", "d", "savedState", "entry", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "inParcel", "(Landroid/os/Parcel;)V", "navigation-runtime_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    @C12579k
    @C11287e
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C19673a();
    @C12579k

    /* renamed from: e */
    public static final C19674b f50357e = new C19674b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final String f50358a;

    /* renamed from: b */
    public final int f50359b;
    @C12580l

    /* renamed from: c */
    public final Bundle f50360c;
    @C12579k

    /* renamed from: d */
    public final Bundle f50361d;

    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    public static final class C19673a implements Parcelable.Creator<NavBackStackEntryState> {
        @C12579k
        /* renamed from: a */
        public NavBackStackEntryState createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        @C12579k
        /* renamed from: b */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    /* renamed from: androidx.navigation.NavBackStackEntryState$b */
    public static final class C19674b {
        public /* synthetic */ C19674b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19674b() {
        }
    }

    public NavBackStackEntryState(@C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, C33541p.f81644a);
        this.f50358a = navBackStackEntry.mo58066g();
        this.f50359b = navBackStackEntry.mo58065f().mo58238f0();
        this.f50360c = navBackStackEntry.mo58062d();
        Bundle bundle = new Bundle();
        this.f50361d = bundle;
        navBackStackEntry.mo58071k(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo58079a() {
        return this.f50360c;
    }

    /* renamed from: b */
    public final int mo58080b() {
        return this.f50359b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo58081c() {
        return this.f50358a;
    }

    @C12579k
    /* renamed from: d */
    public final Bundle mo58082d() {
        return this.f50361d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final NavBackStackEntry mo58084e(@C12579k Context context, @C12579k NavDestination navDestination, @C12579k Lifecycle.State state, @C12580l C19797s sVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(state, "hostLifecycleState");
        Bundle bundle = this.f50360c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.f50342Y.mo58075a(context, navDestination, bundle, state, sVar, this.f50358a, this.f50361d);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f50358a);
        parcel.writeInt(this.f50359b);
        parcel.writeBundle(this.f50360c);
        parcel.writeBundle(this.f50361d);
    }

    public NavBackStackEntryState(@C12579k Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        this.f50358a = readString;
        this.f50359b = parcel.readInt();
        Class<NavBackStackEntryState> cls = NavBackStackEntryState.class;
        this.f50360c = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        Intrinsics.checkNotNull(readBundle);
        this.f50361d = readBundle;
    }
}
