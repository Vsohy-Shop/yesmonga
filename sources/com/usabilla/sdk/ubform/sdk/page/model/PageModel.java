package com.usabilla.sdk.ubform.sdk.page.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import com.usabilla.sdk.ubform.sdk.rule.RulePageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001By\u0012\u0012\b\u0002\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\u0004\b<\u0010=J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0013\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006HÆ\u0003J\u001b\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\tHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0003J{\u0010\u001b\u001a\u00020\u00002\u0012\b\u0002\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\t2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\u0019\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001dHÖ\u0001R!\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b6\u0010)R\u001d\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002070\t8F¢\u0006\u0006\u001a\u0004\b8\u0010,R\u0011\u0010;\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010/¨\u0006>"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/page/model/PageModel;", "Landroid/os/Parcelable;", "Lkotlin/d2;", "v", "", "i", "", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/FieldModel;", "a", "", "", "b", "c", "d", "e", "f", "g", "Lcom/usabilla/sdk/ubform/sdk/rule/RulePageModel;", "h", "fields", "fieldsValues", "name", "type", "isLast", "shouldShowSubmitButton", "defaultJumpTo", "rules", "j", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/util/List;", "n", "()Ljava/util/List;", "Ljava/util/Map;", "o", "()Ljava/util/Map;", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "t", "Z", "u", "()Z", "r", "l", "q", "Lcom/usabilla/sdk/ubform/sdk/rule/RuleFieldModel;", "m", "fieldRules", "s", "toastText", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class PageModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PageModel> CREATOR = new C10065a();
    @C12579k

    /* renamed from: a */
    public final List<FieldModel<?>> f27668a;
    @C12579k

    /* renamed from: b */
    public final Map<String, List<String>> f27669b;
    @C12579k

    /* renamed from: c */
    public final String f27670c;
    @C12579k

    /* renamed from: d */
    public final String f27671d;

    /* renamed from: e */
    public final boolean f27672e;

    /* renamed from: f */
    public final boolean f27673f;
    @C12579k

    /* renamed from: g */
    public final String f27674g;
    @C12579k

    /* renamed from: v */
    public final List<RulePageModel> f27675v;

    /* renamed from: com.usabilla.sdk.ubform.sdk.page.model.PageModel$a */
    public static final class C10065a implements Parcelable.Creator<PageModel> {
        @C12579k
        /* renamed from: a */
        public final PageModel createFromParcel(@C12579k Parcel parcel) {
            Class<PageModel> cls;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                cls = PageModel.class;
                if (i == readInt) {
                    break;
                }
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                i++;
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList2.add(parcel.readParcelable(cls.getClassLoader()));
            }
            return new PageModel(arrayList, linkedHashMap, readString, readString2, z2, z, readString3, arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public final PageModel[] newArray(int i) {
            return new PageModel[i];
        }
    }

    public PageModel() {
        this((List) null, (Map) null, (String) null, (String) null, false, false, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static /* synthetic */ PageModel m38065k(PageModel pageModel, List list, Map map, String str, String str2, boolean z, boolean z2, String str3, List list2, int i, Object obj) {
        PageModel pageModel2 = pageModel;
        int i2 = i;
        return pageModel.mo21409j((i2 & 1) != 0 ? pageModel2.f27668a : list, (i2 & 2) != 0 ? pageModel2.f27669b : map, (i2 & 4) != 0 ? pageModel2.f27670c : str, (i2 & 8) != 0 ? pageModel2.f27671d : str2, (i2 & 16) != 0 ? pageModel2.f27672e : z, (i2 & 32) != 0 ? pageModel2.f27673f : z2, (i2 & 64) != 0 ? pageModel2.f27674g : str3, (i2 & 128) != 0 ? pageModel2.f27675v : list2);
    }

    @C12579k
    /* renamed from: a */
    public final List<FieldModel<?>> mo21397a() {
        return this.f27668a;
    }

    @C12579k
    /* renamed from: b */
    public final Map<String, List<String>> mo21398b() {
        return this.f27669b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo21399c() {
        return this.f27670c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo21400d() {
        return this.f27671d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo21402e() {
        return this.f27672e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageModel)) {
            return false;
        }
        PageModel pageModel = (PageModel) obj;
        return Intrinsics.areEqual((Object) this.f27668a, (Object) pageModel.f27668a) && Intrinsics.areEqual((Object) this.f27669b, (Object) pageModel.f27669b) && Intrinsics.areEqual((Object) this.f27670c, (Object) pageModel.f27670c) && Intrinsics.areEqual((Object) this.f27671d, (Object) pageModel.f27671d) && this.f27672e == pageModel.f27672e && this.f27673f == pageModel.f27673f && Intrinsics.areEqual((Object) this.f27674g, (Object) pageModel.f27674g) && Intrinsics.areEqual((Object) this.f27675v, (Object) pageModel.f27675v);
    }

    /* renamed from: f */
    public final boolean mo21404f() {
        return this.f27673f;
    }

    @C12579k
    /* renamed from: g */
    public final String mo21405g() {
        return this.f27674g;
    }

    @C12579k
    /* renamed from: h */
    public final List<RulePageModel> mo21406h() {
        return this.f27675v;
    }

    public int hashCode() {
        int hashCode = ((((((this.f27668a.hashCode() * 31) + this.f27669b.hashCode()) * 31) + this.f27670c.hashCode()) * 31) + this.f27671d.hashCode()) * 31;
        boolean z = this.f27672e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f27673f;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + this.f27674g.hashCode()) * 31) + this.f27675v.hashCode();
    }

    /* renamed from: i */
    public final boolean mo21408i() {
        for (FieldModel k : this.f27668a) {
            if (k.mo20979k()) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: j */
    public final PageModel mo21409j(@C12579k List<? extends FieldModel<?>> list, @C12579k Map<String, ? extends List<String>> map, @C12579k String str, @C12579k String str2, boolean z, boolean z2, @C12579k String str3, @C12579k List<? extends RulePageModel> list2) {
        Intrinsics.checkNotNullParameter(list, "fields");
        Intrinsics.checkNotNullParameter(map, "fieldsValues");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        String str4 = str3;
        Intrinsics.checkNotNullParameter(str4, "defaultJumpTo");
        List<? extends RulePageModel> list3 = list2;
        Intrinsics.checkNotNullParameter(list3, "rules");
        return new PageModel(list, map, str, str2, z, z2, str4, list3);
    }

    @C12579k
    /* renamed from: l */
    public final String mo21410l() {
        return this.f27674g;
    }

    @C12579k
    /* renamed from: m */
    public final Map<String, RuleFieldModel> mo21411m() {
        boolean z;
        ArrayList<FieldModel> arrayList = new ArrayList<>();
        for (Object next : this.f27668a) {
            if (((FieldModel) next).mo20975f() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<Pair> arrayList2 = new ArrayList<>(C10978t.m41495Y(arrayList, 10));
        for (FieldModel fieldModel : arrayList) {
            if (fieldModel.mo20974e() == null) {
                fieldModel.mo20981o(UUID.randomUUID().toString());
            }
            arrayList2.add(new Pair(fieldModel.mo20974e(), fieldModel.mo20975f()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(arrayList2, 10)), 16));
        for (Pair pair : arrayList2) {
            Object e = pair.mo21849e();
            Intrinsics.checkNotNullExpressionValue(e, "it.first");
            linkedHashMap.put((String) e, (RuleFieldModel) pair.mo21851f());
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: n */
    public final List<FieldModel<?>> mo21412n() {
        return this.f27668a;
    }

    @C12579k
    /* renamed from: o */
    public final Map<String, List<String>> mo21413o() {
        return this.f27669b;
    }

    @C12579k
    /* renamed from: p */
    public final String mo21414p() {
        return this.f27670c;
    }

    @C12579k
    /* renamed from: q */
    public final List<RulePageModel> mo21415q() {
        return this.f27675v;
    }

    /* renamed from: r */
    public final boolean mo21416r() {
        return this.f27673f;
    }

    @C12579k
    /* renamed from: s */
    public final String mo21417s() {
        Object obj;
        if (!Intrinsics.areEqual((Object) this.f27671d, (Object) PageType.TOAST.mo21378q())) {
            return " ";
        }
        Iterator it = this.f27668a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((FieldModel) obj).mo20972c().mo21121g(), (Object) FieldType.PARAGRAPH.mo21121g())) {
                break;
            }
        }
        FieldModel fieldModel = (FieldModel) obj;
        if (fieldModel == null) {
            return " ";
        }
        Object d = fieldModel.mo20973d();
        if (d != null) {
            return (String) d;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @C12579k
    /* renamed from: t */
    public final String mo21418t() {
        return this.f27671d;
    }

    @C12579k
    public String toString() {
        return "PageModel(fields=" + this.f27668a + ", fieldsValues=" + this.f27669b + ", name=" + this.f27670c + ", type=" + this.f27671d + ", isLast=" + this.f27672e + ", shouldShowSubmitButton=" + this.f27673f + ", defaultJumpTo=" + this.f27674g + ", rules=" + this.f27675v + ')';
    }

    /* renamed from: u */
    public final boolean mo21420u() {
        return this.f27672e;
    }

    /* renamed from: v */
    public final void mo21421v() {
        if (!this.f27672e) {
            for (FieldModel n : this.f27668a) {
                n.mo20900n();
            }
        }
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<FieldModel<?>> list = this.f27668a;
        parcel.writeInt(list.size());
        for (FieldModel<?> writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        Map<String, List<String>> map = this.f27669b;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeStringList((List) next.getValue());
        }
        parcel.writeString(this.f27670c);
        parcel.writeString(this.f27671d);
        parcel.writeInt(this.f27672e ? 1 : 0);
        parcel.writeInt(this.f27673f ? 1 : 0);
        parcel.writeString(this.f27674g);
        List<RulePageModel> list2 = this.f27675v;
        parcel.writeInt(list2.size());
        for (RulePageModel writeParcelable2 : list2) {
            parcel.writeParcelable(writeParcelable2, i);
        }
    }

    public PageModel(@C12579k List<? extends FieldModel<?>> list, @C12579k Map<String, ? extends List<String>> map, @C12579k String str, @C12579k String str2, boolean z, boolean z2, @C12579k String str3, @C12579k List<? extends RulePageModel> list2) {
        Intrinsics.checkNotNullParameter(list, "fields");
        Intrinsics.checkNotNullParameter(map, "fieldsValues");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "defaultJumpTo");
        Intrinsics.checkNotNullParameter(list2, "rules");
        this.f27668a = list;
        this.f27669b = map;
        this.f27670c = str;
        this.f27671d = str2;
        this.f27672e = z;
        this.f27673f = z2;
        this.f27674g = str3;
        this.f27675v = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PageModel(java.util.List r10, java.util.Map r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15, java.lang.String r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r10
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r11
        L_0x0018:
            r3 = r0 & 4
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0020
            r3 = r4
            goto L_0x0021
        L_0x0020:
            r3 = r12
        L_0x0021:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0027
            r5 = r4
            goto L_0x0028
        L_0x0027:
            r5 = r13
        L_0x0028:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L_0x002f
            r6 = r7
            goto L_0x0030
        L_0x002f:
            r6 = r14
        L_0x0030:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r7 = r15
        L_0x0036:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = r16
        L_0x003d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0049
        L_0x0047:
            r0 = r17
        L_0x0049:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.page.model.PageModel.<init>(java.util.List, java.util.Map, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
