package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMNode;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.g */
public final class C36487g extends C28486g<APIMNode, ProductCategoryDomain> {

    /* renamed from: b */
    public static final int f90174b = 0;

    @C12580l
    /* renamed from: d */
    public ProductCategoryDomain mo72340a(@C12580l APIMNode aPIMNode) {
        if (aPIMNode != null) {
            return new ProductCategoryDomain(String.valueOf(aPIMNode.getId()), aPIMNode.getName(), aPIMNode.getLevel(), aPIMNode.getCode(), mo72340a(aPIMNode.getSub_node()));
        }
        return null;
    }
}
