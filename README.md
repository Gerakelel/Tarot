# Tarot

**Tarot** ist eine deutsche domänenspezifische Sprache (DSL), entwickelt von:

- Paul Kramer
- Oliver M. Gröne
- Nina Kempke
- Lisa Ostertag
- Eren Karakaya

## Projektziel

Ziel des Projekts ist die Entwicklung einer domänenspezifischen Sprache inklusive Interpreter und Validierung. Das Projekt entsteht im Rahmen einer Projektarbeit der Lehrveranstaltung Informationsinfrastrukturen und wird nach einem festgelegten Entwicklungsworkflow umgesetzt.
 
## Workflow

Die Entwicklung erfolgt über das GitHub-Projekt **„Tarot Entwicklung“**.

> https://github.com/users/Gerakelel/projects/2/views/1

![Workflow](https://github.com/user-attachments/assets/d6c05136-88cb-4032-85b0-b8c7aafc1a4a)

Der grundlegende Workflow sieht wie folgt aus:

1. Issue erstellen oder auswählen.
2. Eigenen Feature-Branch erstellen.
3. Änderungen im Pair Programming entwickeln.
4. Pull Request erstellen.
5. Code Review durchführen.
6. Nach erfolgreichem Review in `main` mergen.

## Projektkonventionen

Für die Entwicklung gelten folgende Konventionen:

- Dokumentation und Quellcode werden in deutscher Sprache verfasst.
- Entwicklung erfolgt im Pair Programming.
- Binäre Dateien werden nicht versioniert und befinden sich in der `.gitignore`.
- Änderungen werden ausschließlich über Pull Requests in den `main`-Branch übernommen.
- Jede größere Änderung wird durch ein GitHub-Issue dokumentiert.

## Repository-Struktur

```text
.
├── programme/     # Beispielprogramme
├── src/           # Quellcode
└── README.md
└── .gitignore
```

> Die Struktur kann sich im Verlauf der Entwicklung erweitern.

## Technologien

- Java
- Eclipse Xtext
- Git
- GitHub

## Mitwirkende

| Name | Bereich |
|------|---------|
| Paul Kramer | DSL, Product Owner |
| Lisa Ostertag | DSL |
| Nina Kempke | DSL |
| Eren Karakaya | Interpreter |
| Oliver M. Gröne | Validator |

## Lizenz
Dieses Projekt entstand im Rahmen einer Hochschulveranstaltung.
