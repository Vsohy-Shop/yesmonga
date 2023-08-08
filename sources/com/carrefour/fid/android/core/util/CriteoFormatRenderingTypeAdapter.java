package com.carrefour.fid.android.core.util;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.CriteoFormatRendering;
import com.google.gson.C33614e;
import com.google.gson.C33624i;
import com.google.gson.C33698j;
import com.google.gson.C33699k;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/util/CriteoFormatRenderingTypeAdapter;", "Lcom/google/gson/j;", "Lcom/carrefour/fid/android/data/entities/CriteoFormatRendering;", "Lcom/google/gson/k;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/i;", "context", "b", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CriteoFormatRenderingTypeAdapter implements C33698j<CriteoFormatRendering> {

    /* renamed from: a */
    public static final int f89978a = 0;

    @C12580l
    /* renamed from: b */
    public CriteoFormatRendering mo84115a(@C12580l C33699k kVar, @C12580l Type type, @C12580l C33624i iVar) {
        try {
            return (CriteoFormatRendering) new C33614e().mo97475j(kVar, type);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }
}
