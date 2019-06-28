#
## Wheelwriter 70 Matrix (US English)
#
# Because the keyboard is labeled for use on a typewriter, some key remapping is necessary for use with a PC.
#
## Functionality Differences:
# The '6' key has a '¢' symbol on top, but it will output the standard Caret (^) symbol when shifted.
# The '±' key above the Tab key acts as the (` and ~) Grave Accent key.
# The right bracket key (]) produces the right curly brace (}) symbol when shifted.
# The '½' key produces the left bracket ([) and left curly brace ({) symbols.
#
## Keys on the left side 10 key vertical block:
# The keys on the left are used as function keys F1-F10.
#
## Keys on the right side 13 key vertical block:
# The 'Exit' key is used as the 'ESC' key.
# The 'Menu' key is used as the Left 'GUI' key.
# The 'Bgn L' key is used as the 'Home' key.
# The 'End L' key is used as the 'End' key.
#
## Keys on the spacebar Row:
# The 'Code' key is used as the 'Ctrl' key.
# The Correction key [<X]] is used as the 'Alt' key.
# 
# Teensy Connections:
# Strobe pins, left side 16 pin connector (pin 1 is the leftmost pin as pictured from the front of the keyboard)
# Connector : Teensy
#         1 : NC
#         2 : B0
#         3 : B1
#         4 : B2
#         5 : B3
#         6 : B7
#         7 : D0
#         8 : D1
#         9 : D2
#        10 : D3
#        11 : C6
#        12 : C7
#        13 : D5
#        14 : D4
#        15 : D6
#        16 : NC
# 
# Sense pins, right side 16 pin connector (pin 1 is the leftmost pin as pictured from the front of the keyboard)
#         1 : F0
#         2 : F1
#         3 : F4
#         4 : F5
#         5 : F6
#         6 : F7
#         7 : B6
#         8 : B5
#         9 : NC
#        10 : NC
#        11 : NC
#        12 : NC
#        13 : NC
#        14 : NC
#        15 : NC
#        16 : NC

matrix
  scanrate 1
  debounce 5
  blocking 0
  
  #             f10          f7           f1           f3           f4           f5           ---           space
  #             f9           f8           f2           ---          tab          F6           lock          erase      
  #             ---          ---          ---          ---          ---          ---          right shift   left shift 
  #             ---          a            ±            1            q            ---          z             ---         
  #             ---          s            ---          2            w            ---          x             ---               
  #             ---          d            ---          3            e            ---          c             ---         
  #             g            f            5            4            r            t            v             b        
  #             h            j            6            7            u            y            m             n        
  #             ---          k            =            8            i            ]            ,             ---         
  #             ---          l            ---          9            o            ---          .             ---            
  #             ±            ;            -            0            p            ½            ---           /        
  #             enter        delete       backspace    exit         insert       ---          up arrow      left arrow
  #             down arrow   end l        menu         typescreen   bgn l        page up      page down     right arrow
  #             ---          ---          ---          ---          ---          ---          ---           code
  
  sense         PF0          PF1          PF4          PF5          PF6          PF7          PB6           PB5  
  strobe  PB0   F10          F7           F1           F3           F4           F5           UNASSIGNED    SPACE           #07 
  strobe  PB1   F9           F8           F2           UNASSIGNED   TAB          F6           CAPS_LOCK     LALT            #0F
  strobe  PB2   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   RSHIFT        LSHIFT          #17
  strobe  PB3   UNASSIGNED   A            BACK_QUOTE   1            Q            UNASSIGNED   Z             UNASSIGNED      #1F
  strobe  PB7   UNASSIGNED   S            UNASSIGNED   2            W            UNASSIGNED   X             UNASSIGNED      #27
  strobe  PD0   UNASSIGNED   D            UNASSIGNED   3            E            UNASSIGNED   C             UNASSIGNED      #2F
  strobe  PD1   G            F            5            4            R            T            V             B               #37
  strobe  PD2   H            J            6            7            U            Y            M             N               #3F
  strobe  PD3   UNASSIGNED   K            EQUAL        8            I            RIGHT_BRACE  COMMA         UNASSIGNED      #47
  strobe  PC6   UNASSIGNED   L            UNASSIGNED   9            O            UNASSIGNED   PERIOD        UNASSIGNED      #4F
  strobe  PC7   QUOTE        SEMICOLON    MINUS        0            P            UNASSIGNED   UNASSIGNED    SLASH           #57
  strobe  PD5   ENTER        DELETE       BACKSPACE    ESC          INSERT       UNASSIGNED   UP            LEFT            #5F
  strobe  PD4   DOWN         END          LGUI         UNASSIGNED   HOME         PAGE_UP      PAGE_DOWN     RIGHT           #67
  strobe  PD6   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LCTRL           #6F
end  

macroblock
endblock

layerblock
endblock

# Function Modifier Layer
remapblock
endblock