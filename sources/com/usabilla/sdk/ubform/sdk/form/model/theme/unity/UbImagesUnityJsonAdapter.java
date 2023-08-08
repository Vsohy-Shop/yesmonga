package com.usabilla.sdk.ubform.sdk.form.model.theme.unity;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.C35431v;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnityJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnity;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "listOfStringAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbImagesUnityJsonAdapter extends C35384h<UbImagesUnity> {
    @C12580l
    private volatile Constructor<UbImagesUnity> constructorRef;
    @C12579k
    private final C35384h<List<String>> listOfStringAdapter;
    @C12579k
    private final C35384h<String> nullableStringAdapter;
    @C12579k
    private final JsonReader.C35351b options;

    public UbImagesUnityJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("enabledEmoticons", "disabledEmoticons", "star", "starOutline");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"enabledEmoticons\",\n      \"disabledEmoticons\", \"star\", \"starOutline\")");
        this.options = a;
        Class<String> cls = String.class;
        C35384h<List<String>> g = sVar.mo106089g(C35431v.m146026m(List.class, cls), C10930d1.m40892k(), "selectedEmoticons");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),\n      \"selectedEmoticons\")");
        this.listOfStringAdapter = g;
        C35384h<String> g2 = sVar.mo106089g(cls, C10930d1.m40892k(), "star");
        Intrinsics.checkNotNullExpressionValue(g2, "moshi.adapter(String::class.java,\n      emptySet(), \"star\")");
        this.nullableStringAdapter = g2;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UbImagesUnity");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C12579k
    public UbImagesUnity fromJson(@C12579k JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "reader");
        jsonReader.mo105873b();
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.mo105877g()) {
            int x = jsonReader.mo105893x(this.options);
            if (x == -1) {
                jsonReader.mo105867D();
                jsonReader.mo105868E();
            } else if (x == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -2;
                } else {
                    JsonDataException z = C35393c.m145827z("selectedEmoticons", "enabledEmoticons", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"selectedEmoticons\", \"enabledEmoticons\", reader)");
                    throw z;
                }
            } else if (x == 1) {
                list2 = this.listOfStringAdapter.fromJson(jsonReader);
                if (list2 != null) {
                    i &= -3;
                } else {
                    JsonDataException z2 = C35393c.m145827z("unselectedEmoticons", "disabledEmoticons", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(z2, "unexpectedNull(\"unselectedEmoticons\", \"disabledEmoticons\", reader)");
                    throw z2;
                }
            } else if (x == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (x == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.mo105875d();
        if (i != -16) {
            Constructor<UbImagesUnity> constructor = this.constructorRef;
            if (constructor == null) {
                Class<List> cls = List.class;
                Class<String> cls2 = String.class;
                constructor = UbImagesUnity.class.getDeclaredConstructor(new Class[]{cls, cls, cls2, cls2, Integer.TYPE, C35393c.f86952c});
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "UbImagesUnity::class.java.getDeclaredConstructor(List::class.java, List::class.java,\n          String::class.java, String::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
            }
            UbImagesUnity newInstance = constructor.newInstance(new Object[]{list, list2, str, str2, Integer.valueOf(i), null});
            Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInstance(\n          selectedEmoticons,\n          unselectedEmoticons,\n          star,\n          starOutline,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
            return newInstance;
        } else if (list == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        } else if (list2 != null) {
            return new UbImagesUnity(list, list2, str, str2);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        }
    }

    public void toJson(@C12579k C35407q qVar, @C12580l UbImagesUnity ubImagesUnity) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (ubImagesUnity != null) {
            qVar.mo106040c();
            qVar.mo106045n("enabledEmoticons");
            this.listOfStringAdapter.toJson(qVar, ubImagesUnity.getSelectedEmoticons());
            qVar.mo106045n("disabledEmoticons");
            this.listOfStringAdapter.toJson(qVar, ubImagesUnity.getUnselectedEmoticons());
            qVar.mo106045n("star");
            this.nullableStringAdapter.toJson(qVar, ubImagesUnity.getStar());
            qVar.mo106045n("starOutline");
            this.nullableStringAdapter.toJson(qVar, ubImagesUnity.getStarOutline());
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
