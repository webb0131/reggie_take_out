package com.webb.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.webb.reggie.dto.SetmealDto;
import com.webb.reggie.entity.Setmeal;

import java.util.List;

public interface SetMealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}
