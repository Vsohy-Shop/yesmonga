package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.mlkit.common.model.C33920d;
import java.io.File;

@C40473a
public interface ModelValidator {

    @C40473a
    public static class ValidationResult {
        @RecentlyNonNull
        @C40473a

        /* renamed from: c */
        public static final ValidationResult f82391c = new ValidationResult(ErrorCode.OK, (String) null);

        /* renamed from: a */
        public final ErrorCode f82392a;
        @C0363p0

        /* renamed from: b */
        public final String f82393b;

        @C40473a
        public enum ErrorCode {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        @C40473a
        public ValidationResult(@RecentlyNonNull ErrorCode errorCode, @C0363p0 String str) {
            this.f82392a = errorCode;
            this.f82393b = str;
        }

        @RecentlyNonNull
        @C40473a
        /* renamed from: a */
        public ErrorCode mo98742a() {
            return this.f82392a;
        }

        @C40473a
        @RecentlyNullable
        /* renamed from: b */
        public String mo98743b() {
            return this.f82393b;
        }

        @C40473a
        /* renamed from: c */
        public boolean mo98744c() {
            if (this.f82392a == ErrorCode.OK) {
                return true;
            }
            return false;
        }
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    ValidationResult mo98741a(@RecentlyNonNull File file, @RecentlyNonNull C33920d dVar);
}
