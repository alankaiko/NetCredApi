package br.com.netcred.NetCredApi.acore.utils;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;

public class ObjectUtil {
    public ObjectUtil() {
    }

    public static Boolean isNull(Object object) {
        return object == null;
    }

    public static <T extends AbstractEntity> Boolean isNewEntity(T object) {
        return isNull(object) || !NumberUtil.isPositive(object.getId());
    }
}
