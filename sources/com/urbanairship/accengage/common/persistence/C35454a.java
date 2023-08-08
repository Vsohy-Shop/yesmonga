package com.urbanairship.accengage.common.persistence;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.accengage.common.persistence.a */
public class C35454a {
    @C0348i1
    @C0359n0
    /* renamed from: a */
    public C9323b mo106284a(@C0359n0 Context context, @C0359n0 String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            if (openFileInput == null) {
                return C9323b.f25440b;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return JsonValue.m34960C(sb.toString()).mo18749A();
                }
            }
        } catch (FileNotFoundException unused) {
            C36059m.m148406b("JSONArchive - Unable to open file (reading) : %s", str);
            return C9323b.f25440b;
        } catch (IOException e) {
            C36059m.m148407c(e, "JSONArchive - Error while closing file (reading) : %s", str);
            return C9323b.f25440b;
        } catch (JsonException e2) {
            C36059m.m148407c(e2, "JSONArchive - Error while converting file to JSONObject (reading) : %s", str);
            return C9323b.f25440b;
        }
    }
}
