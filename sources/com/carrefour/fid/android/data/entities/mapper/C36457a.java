package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.Category;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.a */
public final class C36457a extends C28486g<Category, ProductCategoryDomain> {

    /* renamed from: b */
    public static final int f90132b = 0;

    @C12580l
    /* renamed from: d */
    public ProductCategoryDomain mo72340a(@C12580l Category category) {
        String str;
        int i;
        String str2;
        if (category == null) {
            return null;
        }
        String valueOf = String.valueOf(category.getId());
        String name = category.getName();
        if (name == null) {
            str = "";
        } else {
            str = name;
        }
        Integer level = category.getLevel();
        if (level != null) {
            i = level.intValue();
        } else {
            i = -1;
        }
        int i2 = i;
        String idPath = category.getIdPath();
        if (idPath == null) {
            str2 = "";
        } else {
            str2 = idPath;
        }
        return new ProductCategoryDomain(valueOf, str, i2, str2, mo72340a(category.getSubNode()));
    }
}
