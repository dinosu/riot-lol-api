package riot.api.lolstaticdata.models;

import java.util.List;

/*
 * Copyright 2014 Taylor Caldwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class SummonerSpell {

    private static final long serialVersionUID = -8682930729114683183L;
    private List<Double> cooldown;
    private List<Integer> cost;
    private List<Object> effect;
    private List<String> effectBurn;
    private List<String> modes;
    private Object range;
    private List<SpellVars> vars;
    private String cooldownBurn, costBurn, costType, description,
            key, name, rangeBurn, resource, sanitizedDescription,
            sanitizedTooltip, tooltip;
    private int id, maxrank, summonerLevel;
    private Image image;
    private LevelTip leveltip;

    public List<Double> getCooldown() {
        return cooldown;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public List<String> getModes() {
        return modes;
    }

    public Object getRange() {
        return range;
    }

    public List<SpellVars> getVars() {
        return vars;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public String getTooltip() {
        return tooltip;
    }

    public int getId() {
        return id;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public Image getImage() {
        return image;
    }

    public LevelTip getLeveltip() {
        return leveltip;
    }

}
