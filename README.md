# meta-stm32f7x

## Summary

**stm32f7x** is a yocto layer containing BSP support for the [stm32f7x](https://www.st.com/en/microcontrollers-microprocessors/stm32f7-series.html) MCU based devices.

This layer relies on OpenEmbedded/Yocto build system and depends on:

```
[OECORE]
URI: https://git.yoctoproject.org/git/poky.git
layers: meta
branch: same dedicated branch as meta-stm32f7x
```

## Build

This layer can be integrated in your layers or built standalone using [kas-tool](https://github.com/siemens/kas):

```
kas build kas-stm32f7x.yml
```

or using kas docker container:

```
kas-container build kas-stm32f7x.yml
```

## Flash & Run

```
STM32_Programmer_CLI -c port=SWD -w u-boot-stm32f769-disco.bin 0x08000000  -rst 

STM32_Programmer_CLI -c port=SWD -el /opt/stm32/bin/ExternalLoader/MX25L512G_STM32F769I-DISCO.stldr -w fitImage-stm32f769-disco.bin 0x90000000  -rst 

```








