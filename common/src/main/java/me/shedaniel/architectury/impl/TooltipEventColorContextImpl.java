/*
 * This file is part of architectury.
 * Copyright (C) 2020, 2021, 2022 architectury
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package me.shedaniel.architectury.impl;

import me.shedaniel.architectury.event.events.TooltipEvent;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class TooltipEventColorContextImpl implements TooltipEvent.ColorContext {
    private int backgroundColor;
    private int outlineGradientTopColor;
    private int outlineGradientBottomColor;
    
    public TooltipEventColorContextImpl reset() {
        this.backgroundColor = 0xf0100010;
        this.outlineGradientTopColor = 0x505000ff;
        this.outlineGradientBottomColor = 0x5028007f;
        
        return this;
    }
    
    @Override
    public int getBackgroundColor() {
        return backgroundColor;
    }
    
    @Override
    public void setBackgroundColor(int color) {
        this.backgroundColor = color;
    }
    
    @Override
    public int getOutlineGradientTopColor() {
        return outlineGradientTopColor;
    }
    
    @Override
    public void setOutlineGradientTopColor(int color) {
        this.outlineGradientTopColor = color;
    }
    
    @Override
    public int getOutlineGradientBottomColor() {
        return outlineGradientBottomColor;
    }
    
    @Override
    public void setOutlineGradientBottomColor(int color) {
        this.outlineGradientBottomColor = color;
    }
}
