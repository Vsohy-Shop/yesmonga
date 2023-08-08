package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.C0346i;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.core.app.C17125i;
import androidx.core.content.C17318d;
import androidx.navigation.C19844w0;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.events.C9175a;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Navigator.C19689b("activity")
@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u0010B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, mo22516d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$b;", "m", "", "k", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/k0;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "Landroidx/navigation/NavDestination;", "o", "Landroid/content/Context;", "c", "Landroid/content/Context;", "n", "()Landroid/content/Context;", "context", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "<init>", "(Landroid/content/Context;)V", "e", "a", "b", "navigation-runtime_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
public class ActivityNavigator extends Navigator<C19667b> {
    @C12579k

    /* renamed from: e */
    public static final C19666a f50323e = new C19666a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final String f50324f = "android-support-navigation:ActivityNavigator:source";
    @C12579k

    /* renamed from: g */
    public static final String f50325g = "android-support-navigation:ActivityNavigator:current";
    @C12579k

    /* renamed from: h */
    public static final String f50326h = "android-support-navigation:ActivityNavigator:popEnterAnim";
    @C12579k

    /* renamed from: i */
    public static final String f50327i = "android-support-navigation:ActivityNavigator:popExitAnim";
    @C12579k

    /* renamed from: j */
    public static final String f50328j = "ActivityNavigator";
    @C12579k

    /* renamed from: c */
    public final Context f50329c;
    @C12580l

    /* renamed from: d */
    public final Activity f50330d;

    /* renamed from: androidx.navigation.ActivityNavigator$a */
    public static final class C19666a {
        public /* synthetic */ C19666a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11384m
        /* renamed from: a */
        public final void mo58038a(@C12579k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            Intent intent = activity.getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra(ActivityNavigator.f50326h, -1);
                int intExtra2 = intent.getIntExtra(ActivityNavigator.f50327i, -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    if (intExtra == -1) {
                        intExtra = 0;
                    }
                    if (intExtra2 == -1) {
                        intExtra2 = 0;
                    }
                    activity.overridePendingTransition(intExtra, intExtra2);
                }
            }
        }

        public C19666a() {
        }
    }

    @NavDestination.C19685a(Activity.class)
    /* renamed from: androidx.navigation.ActivityNavigator$b */
    public static class C19667b extends NavDestination {
        @C12580l

        /* renamed from: E0 */
        public String f50331E0;
        @C12580l

        /* renamed from: F0 */
        public Uri f50332F0;
        @C12580l

        /* renamed from: X */
        public String f50333X;
        @C12580l

        /* renamed from: Y */
        public String f50334Y;
        @C12580l

        /* renamed from: Z */
        public ComponentName f50335Z;
        @C12580l

        /* renamed from: z */
        public Intent f50336z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19667b(@C12579k Navigator<? extends C19667b> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
            Intrinsics.checkNotNullParameter(navigator, "activityNavigator");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: C0 */
        public boolean mo58039C0() {
            return false;
        }

        @C12580l
        /* renamed from: F0 */
        public final String mo58040F0() {
            Intent intent = this.f50336z;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @C12580l
        /* renamed from: G0 */
        public final ComponentName mo58041G0() {
            Intent intent = this.f50336z;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @C12580l
        /* renamed from: H0 */
        public final Uri mo58042H0() {
            Intent intent = this.f50336z;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @C12580l
        /* renamed from: I0 */
        public final String mo58043I0() {
            return this.f50333X;
        }

        @C12580l
        /* renamed from: J0 */
        public final Intent mo58044J0() {
            return this.f50336z;
        }

        @C12580l
        /* renamed from: K0 */
        public final String mo58045K0() {
            Intent intent = this.f50336z;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @C12579k
        /* renamed from: L0 */
        public final C19667b mo58046L0(@C12580l String str) {
            if (this.f50336z == null) {
                this.f50336z = new Intent();
            }
            Intent intent = this.f50336z;
            Intrinsics.checkNotNull(intent);
            intent.setAction(str);
            return this;
        }

        @C12579k
        /* renamed from: M0 */
        public final C19667b mo58047M0(@C12580l ComponentName componentName) {
            if (this.f50336z == null) {
                this.f50336z = new Intent();
            }
            Intent intent = this.f50336z;
            Intrinsics.checkNotNull(intent);
            intent.setComponent(componentName);
            return this;
        }

        @C12579k
        /* renamed from: N0 */
        public final C19667b mo58048N0(@C12580l Uri uri) {
            if (this.f50336z == null) {
                this.f50336z = new Intent();
            }
            Intent intent = this.f50336z;
            Intrinsics.checkNotNull(intent);
            intent.setData(uri);
            return this;
        }

        @C12579k
        /* renamed from: O0 */
        public final C19667b mo58049O0(@C12580l String str) {
            this.f50333X = str;
            return this;
        }

        @C12579k
        /* renamed from: P0 */
        public final C19667b mo58050P0(@C12580l Intent intent) {
            this.f50336z = intent;
            return this;
        }

        @C12579k
        /* renamed from: R0 */
        public final C19667b mo58051R0(@C12580l String str) {
            if (this.f50336z == null) {
                this.f50336z = new Intent();
            }
            Intent intent = this.f50336z;
            Intrinsics.checkNotNull(intent);
            intent.setPackage(str);
            return this;
        }

        public boolean equals(@C12580l Object obj) {
            boolean z;
            if (obj == null || !(obj instanceof C19667b) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f50336z;
            if (intent != null) {
                z = intent.filterEquals(((C19667b) obj).f50336z);
            } else if (((C19667b) obj).f50336z == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !Intrinsics.areEqual((Object) this.f50333X, (Object) ((C19667b) obj).f50333X)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f50336z;
            int i2 = 0;
            if (intent != null) {
                i = intent.filterHashCode();
            } else {
                i = 0;
            }
            int i3 = (hashCode + i) * 31;
            String str = this.f50333X;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        @C0346i
        /* renamed from: p0 */
        public void mo58054p0(@C12579k Context context, @C12579k AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(attributeSet, "attrs");
            super.mo58054p0(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19844w0.C19847c.ActivityNavigator);
            Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(C19844w0.C19847c.ActivityNavigator_targetPackage);
            if (string != null) {
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                string = C11622t.replace$default(string, C19758j0.f50578h, packageName, false, 4, (Object) null);
            }
            mo58051R0(string);
            String string2 = obtainAttributes.getString(C19844w0.C19847c.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                mo58047M0(new ComponentName(context, string2));
            }
            mo58046L0(obtainAttributes.getString(C19844w0.C19847c.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(C19844w0.C19847c.ActivityNavigator_data);
            if (string3 != null) {
                mo58048N0(Uri.parse(string3));
            }
            mo58049O0(obtainAttributes.getString(C19844w0.C19847c.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }

        @C12579k
        public String toString() {
            ComponentName G0 = mo58041G0();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (G0 != null) {
                sb.append(" class=");
                sb.append(G0.getClassName());
            } else {
                String F0 = mo58040F0();
                if (F0 != null) {
                    sb.append(" action=");
                    sb.append(F0);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C19667b(@C12579k C19795r0 r0Var) {
            this((Navigator<? extends C19667b>) r0Var.mo58561e(ActivityNavigator.class));
            Intrinsics.checkNotNullParameter(r0Var, "navigatorProvider");
        }
    }

    /* renamed from: androidx.navigation.ActivityNavigator$c */
    public static final class C19668c implements Navigator.C19688a {

        /* renamed from: a */
        public final int f50337a;
        @C12580l

        /* renamed from: b */
        public final C17125i f50338b;

        /* renamed from: androidx.navigation.ActivityNavigator$c$a */
        public static final class C19669a {

            /* renamed from: a */
            public int f50339a;
            @C12580l

            /* renamed from: b */
            public C17125i f50340b;

            @C12579k
            /* renamed from: a */
            public final C19669a mo58058a(int i) {
                this.f50339a = i | this.f50339a;
                return this;
            }

            @C12579k
            /* renamed from: b */
            public final C19668c mo58059b() {
                return new C19668c(this.f50339a, this.f50340b);
            }

            @C12579k
            /* renamed from: c */
            public final C19669a mo58060c(@C12579k C17125i iVar) {
                Intrinsics.checkNotNullParameter(iVar, "activityOptions");
                this.f50340b = iVar;
                return this;
            }
        }

        public C19668c(int i, @C12580l C17125i iVar) {
            this.f50337a = i;
            this.f50338b = iVar;
        }

        @C12580l
        /* renamed from: a */
        public final C17125i mo58056a() {
            return this.f50338b;
        }

        /* renamed from: b */
        public final int mo58057b() {
            return this.f50337a;
        }
    }

    public ActivityNavigator(@C12579k Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f50329c = context;
        Iterator it = SequencesKt__SequencesKt.m44595l(context, ActivityNavigator$hostActivity$1.f50341f).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f50330d = (Activity) obj;
    }

    @C11384m
    /* renamed from: l */
    public static final void m91321l(@C12579k Activity activity) {
        f50323e.mo58038a(activity);
    }

    /* renamed from: k */
    public boolean mo58034k() {
        Activity activity = this.f50330d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @C12579k
    /* renamed from: m */
    public C19667b mo58032a() {
        return new C19667b((Navigator<? extends C19667b>) this);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public final Context mo58036n() {
        return this.f50329c;
    }

    @C12580l
    /* renamed from: o */
    public NavDestination mo58033d(@C12579k C19667b bVar, @C12580l Bundle bundle, @C12580l C19761k0 k0Var, @C12580l Navigator.C19688a aVar) {
        Intent intent;
        int intExtra;
        boolean z;
        Intrinsics.checkNotNullParameter(bVar, FirebaseAnalytics.C32532b.f78977z);
        if (bVar.mo58044J0() != null) {
            Intent intent2 = new Intent(bVar.mo58044J0());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String I0 = bVar.mo58043I0();
                if (I0 == null || I0.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(I0);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + I0);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z2 = aVar instanceof C19668c;
            if (z2) {
                intent2.addFlags(((C19668c) aVar).mo58057b());
            }
            if (this.f50330d == null) {
                intent2.addFlags(268435456);
            }
            if (k0Var != null && k0Var.mo58460i()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f50330d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra(f50325g, 0)) == 0)) {
                intent2.putExtra(f50324f, intExtra);
            }
            intent2.putExtra(f50325g, bVar.mo58238f0());
            Resources resources = this.f50329c.getResources();
            if (k0Var != null) {
                int c = k0Var.mo58452c();
                int d = k0Var.mo58453d();
                if ((c <= 0 || !Intrinsics.areEqual((Object) resources.getResourceTypeName(c), (Object) "animator")) && (d <= 0 || !Intrinsics.areEqual((Object) resources.getResourceTypeName(d), (Object) "animator"))) {
                    intent2.putExtra(f50326h, c);
                    intent2.putExtra(f50327i, d);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    sb.append(resources.getResourceName(c));
                    sb.append(" and popExit resource ");
                    sb.append(resources.getResourceName(d));
                    sb.append(" when launching ");
                    sb.append(bVar);
                }
            }
            if (z2) {
                C17125i a = ((C19668c) aVar).mo58056a();
                if (a != null) {
                    C17318d.m79740w(this.f50329c, intent2, a.mo51574l());
                } else {
                    this.f50329c.startActivity(intent2);
                }
            } else {
                this.f50329c.startActivity(intent2);
            }
            if (k0Var == null || this.f50330d == null) {
                return null;
            }
            int a2 = k0Var.mo58450a();
            int b = k0Var.mo58451b();
            if ((a2 > 0 && Intrinsics.areEqual((Object) resources.getResourceTypeName(a2), (Object) "animator")) || (b > 0 && Intrinsics.areEqual((Object) resources.getResourceTypeName(b), (Object) "animator"))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity destinations do not support Animator resource. Ignoring enter resource ");
                sb2.append(resources.getResourceName(a2));
                sb2.append(" and exit resource ");
                sb2.append(resources.getResourceName(b));
                sb2.append("when launching ");
                sb2.append(bVar);
                return null;
            } else if (a2 < 0 && b < 0) {
                return null;
            } else {
                this.f50330d.overridePendingTransition(C11479u.m44447u(a2, 0), C11479u.m44447u(b, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(("Destination " + bVar.mo58238f0() + " does not have an Intent set.").toString());
        }
    }
}
