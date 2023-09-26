package net.unethicalite.plugins.lucidgauntlet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("gauntlet")
public class LucidGauntletConfig implements Config
{
    // Sections
    @ConfigSection(
            name = "Resources",
            description = "Resources section.",
            position = 0,
            keyName = "resourcesSection"
    )
    final String resourcesSection = "Resources";

    @ConfigSection(
            name = "Utilities",
            description = "Utilities section.",
            position = 1,
            keyName = "utilitiesSection"
    )
    final String utilitiesSection = "Utilities";

    @ConfigSection(
            name = "Npcs",
            description = "Other npcs section.",
            position = 2,
            keyName = "npcSection"
    )
    final String npcSection = "Npcs";

    @ConfigSection(
            name = "Hunllef",
            description = "Hunllef section.",
            position = 3,
            keyName = "hunllefSection"
    )
    final String hunllefSection = "Hunllef";

    @ConfigSection(
            name = "Projectiles",
            description = "Projectiles section.",
            position = 4,
            keyName = "projectilesSection"
    )
    final String projectilesSection = "Projectiles";

    @ConfigSection(
            name = "Tornadoes",
            description = "Tornadoes section.",
            position = 5,
            keyName = "tornadoesSection"
    )
    final String tornadoesSection = "Tornadoes";

    @ConfigSection(
            name = "Player",
            description = "Player section.",
            position = 6,
            keyName = "playerSection"
    )
    final String playerSection = "Player";

    @ConfigSection(
            name = "Timer",
            description = "Timer section.",
            position = 7,
            keyName = "timerSection"
    )
    final String timerSection = "Timer";

    @ConfigSection(
            name = "Other",
            description = "Other section.",
            position = 8,
            keyName = "otherSection"
    )
    final String otherSection = "Other";

    // Resources Section

    @ConfigItem(
            name = "Overlay resource icon and tile",
            description = "Overlay resources with a respective icon and tile outline.",
            position = 0,
            keyName = "resourceOverlay",
            section = resourcesSection
    )
    public boolean resourceOverlay()
    {
        return false;
    }

    @Range(
            min = 12,
            max = 64
    )
    @ConfigItem(
            name = "Icon size",
            description = "Change the size of the resource icons.",
            position = 1,
            keyName = "resourceIconSize",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceOverlay"
    )
    @Units(Units.POINTS)
    int resourceIconSize()
    {
        return 18;
    }

    @Range(
            min = 1,
            max = 8
    )
    @ConfigItem(
            name = "Tile outline width",
            description = "Change the width of the resource tile outline.",
            position = 2,
            keyName = "resourceTileOutlineWidth",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceOverlay"
    )
    @Units(Units.POINTS)
    public int resourceTileOutlineWidth()
    {
        return 1;
    }

    @Alpha
    @ConfigItem(
            name = "Tile outline color",
            description = "Change the tile outline color of resources.",
            position = 3,
            keyName = "resourceTileOutlineColor",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceOverlay"
    )
    public Color resourceTileOutlineColor()
    {
        return Color.YELLOW;
    }

    @Alpha
    @ConfigItem(
            name = "Tile fill color",
            description = "Change the tile fill color of resources.",
            position = 4,
            keyName = "resourceTileFillColor",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceOverlay"
    )
    public Color resourceTileFillColor()
    {
        return new Color(255, 255, 255, 50);
    }

    @ConfigItem(
            name = "Outline resources",
            description = "Outline resources with a colored outline.",
            position = 5,
            keyName = "resourceOutline",
            section = resourcesSection
    )
    public boolean resourceOutline()
    {
        return false;
    }

    @Range(
            min = 1,
            max = 8
    )
    @ConfigItem(
            name = "Outline width",
            description = "Change the width of the resource outline.",
            position = 6,
            keyName = "resourceOutlineWidth",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceOutline"
    )
    @Units(Units.POINTS)
    public int resourceOutlineWidth()
    {
        return 1;
    }

    @Alpha
    @ConfigItem(
            name = "Outline color",
            description = "Change the outline color of resources.",
            position = 7,
            keyName = "resourceOutlineColor",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceOutline"
    )
    public Color resourceOutlineColor()
    {
        return Color.YELLOW;
    }

    @ConfigItem(
            name = "Track resources",
            description = "Track resources in counter infoboxes.",
            position = 8,
            keyName = "resourceTracker",
            section = resourcesSection,
            enumClass = ResourceFilter.class
    )
    public ResourceFilter resourceTracker()
    {
        return ResourceFilter.OFF;
    }

    @ConfigItem(
            name = "Ore",
            description = "The desired number of ores to acquire.",
            position = 9,
            keyName = "resourceOre",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourceOre()
    {
        return 3;
    }

    @ConfigItem(
            name = "Phren bark",
            description = "The desired number of phren barks to acquire.",
            position = 10,
            keyName = "resourceBark",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourceBark()
    {
        return 3;
    }

    @ConfigItem(
            name = "Linum tirinum",
            description = "The desired number of linum tirinums to acquire.",
            position = 11,
            keyName = "resourceTirinum",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourceTirinum()
    {
        return 3;
    }

    @ConfigItem(
            name = "Grym leaf",
            description = "The desired number of grym leaves to acquire.",
            position = 12,
            keyName = "resourceGrym",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourceGrym()
    {
        return 2;
    }

    @ConfigItem(
            name = "Weapon frames",
            description = "The desired number of weapon frames to acquire.",
            position = 13,
            keyName = "resourceFrame",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourceFrame()
    {
        return 2;
    }

    @ConfigItem(
            name = "Paddlefish",
            description = "The desired number of paddlefish to acquire.",
            position = 14,
            keyName = "resourcePaddlefish",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourcePaddlefish()
    {
        return 20;
    }

    @ConfigItem(
            name = "Crystal shards",
            description = "The desired number of crystal shards to acquire.",
            position = 15,
            keyName = "resourceShard",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public int resourceShard()
    {
        return 320;
    }

    @ConfigItem(
            name = "Bowstring",
            description = "Whether or not to acquire the crystalline or corrupted bowstring.",
            position = 16,
            keyName = "resourceBowstring",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public boolean resourceBowstring()
    {
        return false;
    }

    @ConfigItem(
            name = "Spike",
            description = "Whether or not to acquire the crystal or corrupted spike.",
            position = 17,
            keyName = "resourceSpike",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public boolean resourceSpike()
    {
        return false;
    }

    @ConfigItem(
            name = "Orb",
            description = "Whether or not to acquire the crystal or corrupted orb.",
            position = 18,
            keyName = "resourceOrb",
            section = resourcesSection,
            hidden = true,
            unhide = "resourceTracker",
            unhideValue = "CUSTOM"
    )
    public boolean resourceOrb()
    {
        return false;
    }

    // Utilities Section

    @ConfigItem(
            name = "Outline starting room utilities",
            description = "Outline various utilities in the starting room.",
            position = 0,
            keyName = "utilitiesOutline",
            section = utilitiesSection
    )
    public boolean utilitiesOutline()
    {
        return false;
    }

    @Range(
            min = 2,
            max = 12
    )
    @ConfigItem(
            name = "Outline width",
            description = "Change the width of the utilities outline.",
            position = 1,
            keyName = "utilitiesOutlineWidth",
            section = utilitiesSection,
            hidden = true,
            unhide = "utilitiesOutline"
    )
    @Units(Units.POINTS)
    public int utilitiesOutlineWidth()
    {
        return 4;
    }

    @Alpha
    @ConfigItem(
            name = "Outline color",
            description = "Change the color of the utilities outline.",
            position = 2,
            keyName = "utilitiesOutlineColor",
            section = utilitiesSection,
            hidden = true,
            unhide = "utilitiesOutline"
    )
    public Color utilitiesOutlineColor()
    {
        return Color.MAGENTA;
    }

    // Other Npcs Section

    @ConfigItem(
            name = "Outline demi-bosses",
            description = "Overlay demi-bosses with a colored outline.",
            position = 0,
            keyName = "demibossOutline",
            section = npcSection
    )
    public boolean demibossOutline()
    {
        return false;
    }

    @Range(
            min = 2,
            max = 12
    )
    @ConfigItem(
            name = "Outline width",
            description = "Change the width of the demi-boss outline.",
            position = 1,
            keyName = "demibossOutlineWidth",
            section = npcSection,
            hidden = true,
            unhide = "demibossOutline"
    )
    @Units(Units.POINTS)
    public int demibossOutlineWidth()
    {
        return 4;
    }

    @ConfigItem(
            name = "Outline strong npcs",
            description = "Overlay strong npcs with a colored outline.",
            position = 2,
            keyName = "strongNpcOutline",
            section = npcSection
    )
    public boolean strongNpcOutline()
    {
        return false;
    }

    @Range(
            min = 2,
            max = 12
    )
    @ConfigItem(
            name = "Outline width",
            description = "Change the width of the strong npcs outline.",
            position = 3,
            keyName = "strongNpcOutlineWidth",
            section = npcSection,
            hidden = true,
            unhide = "strongNpcOutline"
    )
    @Units(Units.POINTS)
    public int strongNpcOutlineWidth()
    {
        return 2;
    }

    @Alpha
    @ConfigItem(
            name = "Outline color",
            description = "Change the outline color of strong npcs.",
            position = 4,
            keyName = "strongNpcOutlineColor",
            section = npcSection,
            hidden = true,
            unhide = "strongNpcOutline"
    )
    public Color strongNpcOutlineColor()
    {
        return Color.CYAN;
    }

    @ConfigItem(
            name = "Outline weak npcs",
            description = "Overlay weak npcs with a colored outline.",
            position = 5,
            keyName = "weakNpcOutline",
            section = npcSection
    )
    public boolean weakNpcOutline()
    {
        return false;
    }

    @Range(
            min = 2,
            max = 12
    )
    @ConfigItem(
            name = "Outline width",
            description = "Change the width of the weak npcs outline.",
            position = 6,
            keyName = "weakNpcOutlineWidth",
            section = npcSection,
            hidden = true,
            unhide = "weakNpcOutline"
    )
    @Units(Units.POINTS)
    public int weakNpcOutlineWidth()
    {
        return 2;
    }

    @Alpha
    @ConfigItem(
            name = "Outline color",
            description = "Change the outline color of weak npcs.",
            position = 7,
            keyName = "weakNpcOutlineColor",
            section = npcSection,
            hidden = true,
            unhide = "weakNpcOutline"
    )
    public Color weakNpcOutlineColor()
    {
        return Color.CYAN;
    }

    // Hunllef Section

    @ConfigItem(
            name = "Display counter on Hunllef",
            description = "Overlay the Hunllef with an attack and prayer counter.",
            position = 0,
            keyName = "hunllefOverlayAttackCounter",
            section = hunllefSection
    )
    public boolean hunllefOverlayAttackCounter()
    {
        return false;
    }

    @ConfigItem(
            name = "Counter font style",
            description = "Change the font style of the attack and prayer counter.",
            position = 1,
            keyName = "hunllefAttackCounterFontStyle",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOverlayAttackCounter",
            enumClass = FontStyle.class
    )
    public FontStyle hunllefAttackCounterFontStyle()
    {
        return FontStyle.BOLD;
    }

    @Range(
            min = 12,
            max = 64
    )
    @ConfigItem(
            name = "Counter font size",
            description = "Adjust the font size of the attack and prayer counter.",
            position = 2,
            keyName = "hunllefAttackCounterFontSize",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOverlayAttackCounter"
    )
    @Units(Units.POINTS)
    public int hunllefAttackCounterFontSize()
    {
        return 22;
    }

    @ConfigItem(
            name = "Outline Hunllef on wrong prayer",
            description = "Outline the Hunllef when incorrectly praying against its current attack style.",
            position = 3,
            keyName = "hunllefOverlayWrongPrayerOutline",
            section = hunllefSection
    )
    public boolean hunllefOverlayWrongPrayerOutline()
    {
        return false;
    }

    @Range(
            min = 2,
            max = 12
    )
    @ConfigItem(
            name = "Outline width",
            description = "Change the width of the wrong prayer outline.",
            position = 4,
            keyName = "hunllefWrongPrayerOutlineWidth",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOverlayWrongPrayerOutline"
    )
    @Units(Units.POINTS)
    public int hunllefWrongPrayerOutlineWidth()
    {
        return 4;
    }

    @ConfigItem(
            name = "Outline Hunllef tile",
            description = "Outline the Hunllef's tile.",
            position = 5,
            keyName = "hunllefOutlineTile",
            section = hunllefSection
    )
    public boolean hunllefOutlineTile()
    {
        return false;
    }

    @Range(
            min = 1,
            max = 8
    )
    @ConfigItem(
            name = "Tile outline width",
            description = "Change the width of the Hunllef's tile outline.",
            position = 6,
            keyName = "hunllefTileOutlineWidth",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOutlineTile"
    )
    @Units(Units.POINTS)
    public int hunllefTileOutlineWidth()
    {
        return 1;
    }

    @Alpha
    @ConfigItem(
            name = "Tile outline color",
            description = "Change the outline color of the Hunllef's tile.",
            position = 7,
            keyName = "hunllefOutlineColor",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOutlineTile"
    )
    public Color hunllefOutlineColor()
    {
        return Color.WHITE;
    }

    @Alpha
    @ConfigItem(
            name = "Tile fill color",
            description = "Change the fill color of the Hunllef's tile.",
            position = 8,
            keyName = "hunllefFillColor",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOutlineTile"
    )
    public Color hunllefFillColor()
    {
        return new Color(255, 255, 255, 0);
    }

    @ConfigItem(
            name = "Overlay style icon on Hunllef",
            description = "Overlay a current attack style icon on the Hunllef.",
            position = 9,
            keyName = "hunllefOverlayAttackStyleIcon",
            section = hunllefSection
    )
    public boolean hunllefOverlayAttackStyleIcon()
    {
        return false;
    }

    @Range(
            min = 12,
            max = 64
    )
    @ConfigItem(
            name = "Icon size",
            description = "Change the size of the attack style icon.",
            position = 10,
            keyName = "hunllefAttackStyleIconSize",
            section = hunllefSection,
            hidden = true,
            unhide = "hunllefOverlayAttackStyleIcon"
    )
    @Units(Units.POINTS)
    int hunllefAttackStyleIconSize()
    {
        return 18;
    }

    @ConfigItem(
            name = "Play audio on prayer attack",
            description = "Play an in-game sound when the Hunllef is about to use its prayer attack.",
            position = 11,
            keyName = "hunllefPrayerAudio",
            section = hunllefSection
    )
    boolean hunllefPrayerAudio()
    {
        return false;
    }

    // Projectiles Section

    @ConfigItem(
            name = "Outline projectiles",
            description = "Outline projectiles with a blue (magic) or green (range) color.",
            position = 0,
            keyName = "outlineProjectile",
            section = projectilesSection
    )
    public boolean outlineProjectile()
    {
        return false;
    }

    @ConfigItem(
            name = "Overlay projectile icons",
            description = "Overlay projectiles with their respective icon.",
            position = 1,
            keyName = "overlayProjectileIcon",
            section = projectilesSection
    )
    public boolean overlayProjectileIcon()
    {
        return false;
    }

    @Range(
            min = 12,
            max = 64
    )
    @ConfigItem(
            name = "Icon size",
            description = "Change the size of the projectile icons.",
            position = 2,
            keyName = "projectileIconSize",
            section = projectilesSection,
            hidden = true,
            unhide = "overlayProjectileIcon"
    )
    @Units(Units.POINTS)
    int projectileIconSize()
    {
        return 18;
    }

    // Tornadoes Section

    @ConfigItem(
            name = "Overlay tornado tick counter",
            description = "Overlay tornadoes with a tick counter.",
            position = 0,
            keyName = "tornadoTickCounter",
            section = tornadoesSection
    )
    public boolean tornadoTickCounter()
    {
        return false;
    }

    @ConfigItem(
            name = "Font style",
            description = "Bold/Italics/Plain",
            position = 1,
            keyName = "tornadoFontStyle",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTickCounter",
            enumClass = FontStyle.class
    )
    public FontStyle tornadoFontStyle()
    {
        return FontStyle.BOLD;
    }

    @ConfigItem(
            name = "Font shadow",
            description = "Toggle font shadow of the tornado tick counter.",
            position = 2,
            keyName = "tornadoFontShadow",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTickCounter"
    )
    public boolean tornadoFontShadow()
    {
        return true;
    }

    @Range(
            min = 12,
            max = 64
    )
    @ConfigItem(
            name = "Font size",
            description = "Adjust the font size of the tornado tick counter.",
            position = 3,
            keyName = "tornadoFontSize",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTickCounter"
    )
    @Units(Units.POINTS)
    public int tornadoFontSize()
    {
        return 16;
    }

    @Alpha
    @ConfigItem(
            name = "Font color",
            description = "Color of the tornado tick counter font.",
            position = 4,
            keyName = "tornadoFontColor",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTickCounter"
    )
    public Color tornadoFontColor()
    {
        return Color.WHITE;
    }

    @ConfigItem(
            name = "Outline tornado tile",
            description = "Outline the tiles of tornadoes.",
            position = 5,
            keyName = "tornadoTileOutline",
            section = tornadoesSection
    )
    public boolean tornadoTileOutline()
    {
        return false;
    }

    @Range(
            min = 1,
            max = 8
    )
    @ConfigItem(
            name = "Tile outline width",
            description = "Change tile outline width of tornadoes.",
            position = 6,
            keyName = "tornadoTileOutlineWidth",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTileOutline"
    )
    @Units(Units.POINTS)
    public int tornadoTileOutlineWidth()
    {
        return 1;
    }

    @Alpha
    @ConfigItem(
            name = "Tile outline color",
            description = "Color to outline the tile of a tornado.",
            position = 7,
            keyName = "tornadoOutlineColor",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTileOutline"
    )
    public Color tornadoOutlineColor()
    {
        return Color.YELLOW;
    }

    @Alpha
    @ConfigItem(
            name = "Tile fill color",
            description = "Color to fill the tile of a tornado.",
            position = 8,
            keyName = "tornadoFillColor",
            section = tornadoesSection,
            hidden = true,
            unhide = "tornadoTileOutline"
    )
    public Color tornadoFillColor()
    {
        return new Color(255, 255, 0, 50);
    }

    // Player Section

    @ConfigItem(
            name = "Overlay prayer",
            description = "Overlay the correct prayer to use against the Hunllef's current attack style.",
            position = 0,
            keyName = "prayerOverlay",
            section = playerSection,
            enumClass = PrayerHighlightMode.class
    )
    public PrayerHighlightMode prayerOverlay()
    {
        return PrayerHighlightMode.NONE;
    }

    @ConfigItem(
            name = "Flash on wrong attack style",
            description = "Flash the screen if you use the wrong attack style.",
            position = 1,
            keyName = "flashOnWrongAttack",
            section = playerSection
    )
    public boolean flashOnWrongAttack()
    {
        return false;
    }

    @Range(
            min = 10,
            max = 50
    )
    @ConfigItem(
            name = "Flash duration",
            description = "Change the duration of the flash.",
            position = 2,
            keyName = "flashOnWrongAttackDuration",
            section = playerSection,
            hidden = true,
            unhide = "flashOnWrongAttack"
    )
    public int flashOnWrongAttackDuration()
    {
        return 25;
    }

    @Alpha
    @ConfigItem(
            name = "Flash color",
            description = "Color of the flash notification.",
            position = 3,
            keyName = "flashOnWrongAttackColor",
            section = playerSection,
            hidden = true,
            unhide = "flashOnWrongAttack"
    )
    public Color flashOnWrongAttackColor()
    {
        return new Color(255, 0, 0, 70);
    }

    @ConfigItem(
            name = "Flash on 5:1 method",
            description = "Flash the screen to weapon switch when using 5:1 method.",
            position = 4,
            keyName = "flashOn51Method",
            section = playerSection
    )
    public boolean flashOn51Method()
    {
        return false;
    }

    @Range(
            min = 10,
            max = 50
    )
    @ConfigItem(
            name = "Flash duration",
            description = "Change the duration of the flash.",
            position = 5,
            keyName = "flashOn51MethodDuration",
            section = playerSection,
            hidden = true,
            unhide = "flashOn51Method"
    )
    public int flashOn51MethodDuration()
    {
        return 25;
    }

    @Alpha
    @ConfigItem(
            name = "Flash color",
            description = "Color of the flash notification.",
            position = 6,
            keyName = "flashOn51MethodColor",
            section = playerSection,
            hidden = true,
            unhide = "flashOn51Method"
    )
    public Color flashOn51MethodColor()
    {
        return new Color(255, 190, 0, 50);
    }

    // Timer Section

    @ConfigItem(
            position = 0,
            keyName = "timerOverlay",
            name = "Overlay timer",
            description = "Display an overlay that tracks your gauntlet time.",
            section = timerSection
    )
    public boolean timerOverlay()
    {
        return false;
    }

    @ConfigItem(
            position = 1,
            keyName = "timerChatMessage",
            name = "Chat timer",
            description = "Display a chat message on death with your gauntlet time.",
            section = timerSection
    )
    public boolean timerChatMessage()
    {
        return false;
    }

    // Other Section

    @ConfigItem(
            name = "Render distance",
            description = "Set render distance of various overlays.",
            position = 0,
            keyName = "resourceRenderDistance",
            section = otherSection,
            enumClass = RenderDistance.class
    )
    public RenderDistance resourceRenderDistance()
    {
        return RenderDistance.FAR;
    }

    @ConfigItem(
            name = "Disco mode",
            description = "Kill the Hunllef.",
            position = 1,
            keyName = "discoMode",
            section = otherSection
    )
    public boolean discoMode()
    {
        return false;
    }

    // Constants

    @Getter
    @AllArgsConstructor
    public enum RenderDistance
    {
        SHORT("Short", 2350),
        MEDIUM("Medium", 3525),
        FAR("Far", 4700),
        UNCAPPED("Uncapped", 0);

        private final String name;
        private final int distance;

        @Override
        public String toString()
        {
            return name;
        }
    }

    @Getter
    @AllArgsConstructor
    enum FontStyle
    {
        BOLD("Bold", Font.BOLD),
        ITALIC("Italic", Font.ITALIC),
        PLAIN("Plain", Font.PLAIN);

        private final String name;
        private final int font;

        @Override
        public String toString()
        {
            return name;
        }
    }

    @AllArgsConstructor
    public enum PrayerHighlightMode
    {
        WIDGET("Widget"),
        BOX("Box"),
        BOTH("Both"),
        NONE("None");

        private final String name;

        @Override
        public String toString()
        {
            return name;
        }
    }

    public enum ResourceFilter
    {
        ALL, BASIC, CUSTOM, OFF
    }
}