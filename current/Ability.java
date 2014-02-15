/**
Copyright (c) <2014>, <Erik Mellum>
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of the <organization> nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
**/

/**
 * Attacks is a class created for the purpose of giving weapons attacks with their own damage, name and accuracy 
 * It provides methods for setting and getting the damage name and accuracy.
 *
 * @author Erik Mellum
 * @version 1.0
 */

import java.util.HashMap;
import java.io.Serializable; 
public class Ability extends GameObject
{
    protected HashMap<String, HashMap> ability;
    protected HashMap<String, Effect> effects;
	protected HashMap<String, Stat> stats;
	public Ability()
	{
		name = "Fireball";
		description = "Typical Mage Spell";		
		buildAbility();
	}
	public Ability(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;;
		buildAbility();
	}
	public void buildAbility()
	{
        ability = new HashMap<String, HashMap>();
        effects = new HashMap<String, Effect>();
		stats = new HashMap<String, Stat>();
        ability.put("Effects", effects);
        ability.put("Stats", stats);
		stats.put("Damage",new Stat("Damage",1));
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Duration",new Stat("Duration",1));
		stats.put("Cooldown",new Stat("Cooldown",1));
		stats.put("Defense",new Stat("Defense",1));
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Range",new Stat("Range",1));
		stats.put("Crit",new Stat("Crit",1));
		stats.put("Speed",new Stat("Speed",1));
		stats.put("Cost",new Stat("Cost",1));
        stats.put("CostType",new Stat("CostType",1));
        stats.put("DamageType",new Stat("DamageType",1));
	}
    public HashMap<String, HashMap> get()
    {
        return ability;
    }
    public void set(HashMap<String, HashMap> newAbility)
    {
        ability = newAbility;
    }
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public void setStat(String key, Stat newStat)
    {
        stats.put(key, newStat);
    }
    public HashMap<String, Stat> getStats()
    {
        return stats;
    }
    public void setStats(HashMap<String, Stat> newStats)
    {
        stats = newStats;
    }
    public Effect getEffect(String key)
    {
        return effects.get(key);
    }
    public void setEffect(String key, Effect newEffect)
    {
        effects.put(key, newEffect);
    }
    public HashMap<String, Effect> getEffects()
    {
        return effects;
    }
    public void setEffects(HashMap<String, Effect> newEffects)
    {
        effects = newEffects;
    }
	public String toString()
	{
		String output = name;
		return output;
	}
}